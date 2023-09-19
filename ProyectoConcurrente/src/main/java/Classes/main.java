/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.mongodb.client.MongoCursor;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author mauricio
 */
public class main {

    public static void main(String[] args) {
        MongoDBConnection Menu = new MongoDBConnection();
        Menu.getCollectionDocuments("Usuarios");
        List<Document> Senderos = Menu.getCollectionDocuments("Senderos");
        for (Document Sendero : Senderos) {
            System.out.println(Sendero.toJson());
            System.out.println(Sendero.getString("ubicacion"));
        }
    }
}

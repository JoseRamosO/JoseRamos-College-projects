/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import java.util.List;
import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author mauricio
 */
public class MongoDBConnection {

    public MongoDatabase dataBaseCon() {
        try {
            String textUri = "mongodb+srv://mg110101:mg110101@jgtransportdata.mipff.mongodb.net/main_data?retryWrites=true&w=majority";
            MongoClient mongoClient = MongoClients.create(textUri);
            MongoDatabase BaseDatosProyecto = mongoClient.getDatabase("ProyectoConcurrente");
            System.out.println("BASE DE DATOS OK");
            return BaseDatosProyecto;
        } catch (Exception e) {
            System.out.println("ERROR CONECTANDO CON BASE DE DATOS");
            return null;
        }

    }

    public List<Document> getCollectionDocuments(String CollectionName) {
        MongoCollection<Document> BatabaseCollection = dataBaseCon().getCollection(CollectionName);
        List<Document> CollectionDocuments = BatabaseCollection.find().into(new ArrayList<>());
        return CollectionDocuments;
    }

    public void addCollectionDocument(String Collection, Document doc) {
        MongoDatabase database = dataBaseCon();
        MongoCollection<Document> collection = database.getCollection(Collection);
        collection.insertOne(doc);
    }

    public Document getCollectionDocumentID(String CollectionName, String DocumentId) {
        MongoCollection<Document> BatabaseCollection = dataBaseCon().getCollection(CollectionName);
        Document DocumentTraido = BatabaseCollection.find(eq("_id", new ObjectId(DocumentId))).first();
        return DocumentTraido;
    }
}

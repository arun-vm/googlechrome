package db;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class MongoService {

    private MongoClient mongoClient;
    private MongoDatabase mongodb;
    private MongoCollection mongoCollection;

    public MongoService(String db,String collection)
    {
        mongoClient = new MongoClient("localhost",27017);
         mongodb = mongoClient.getDatabase(db);
         mongoCollection = mongodb.getCollection(collection);
    }

public void addDocument(Document document)
{
        mongoCollection.insertOne(document);
}
}

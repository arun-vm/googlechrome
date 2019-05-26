package db;

import com.google.gson.Gson;
import com.mongodb.util.JSON;
import org.bson.Document;

public class DocumentConverter {

    public static Document getDocument(Object obj){
Gson gson= new Gson();
      return (Document) JSON.parse(gson.toJson(obj));

    }
}

package dk.sb.userrating;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.core.ExecutableInsertOperation;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase database = mongoClient.getDatabase("MongoDB");
    MongoCollection collection = database.getCollection("UserRatings");




    public void insertRating(Rating rating) {
        collection.insertOne(rating);
    }

    public void insertUser(User user) {
        collection.insertOne(user);
    }
}

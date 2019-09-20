package io.l0llygag.roadxserver.configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
    @Override
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI(System.getenv("MONGO_URL")));
    }

    @Override
    protected String getDatabaseName() {
        return "roadx";
    }
}

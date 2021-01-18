//package com.main.serials.MongoConfig;
//
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//
//import java.util.Collection;
//import java.util.Collections;
//
//@Configuration
//@EnableMongoRepositories(basePackages = "com.main.serials.Dao")
//public class MongoConfig extends AbstractMongoClientConfiguration {
//
//    @Override
//    public MongoClient mongoClient() {
//        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/IU6");
//        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .build();
//        return MongoClients.create(mongoClientSettings);
//    }
//
//    @Override
//    protected String getDatabaseName() {
//        return "IU6";
//    }
//    @Override
//    public Collection getMappingBasePackages() {
//        return Collections.singleton("com.main.serials");
//    }
//}

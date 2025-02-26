package com.example.CRUD.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(MongoClients.create("mongodb://localhost:27017"),
                "EmployeeDB");
    }
}

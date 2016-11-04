package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
public interface MessageRepository extends MongoRepository<Message, String> {

    List<Message> findById(@Param("id") String id);
}

package com.insta.instagram.chatFeatures.user;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRespository extends MongoRepository<User,String> {

    List<User> findAllByStatus(Status online);

}

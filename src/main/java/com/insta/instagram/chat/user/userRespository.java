package com.insta.instagram.chat.user;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRespository extends MongoRepository<User,String> {

    List<User> findAllByStatus(Status online);

}

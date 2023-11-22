package com.insta.instagram.chatFeatures.chatroom;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRoomRepository extends MongoRepository<ChatRoom,String> {

    Optional<ChatRoom> findBySenderIdAndRecipentId(String senderId, String receipientId);

}

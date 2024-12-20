package com.example.backend.modelRelations;

import java.sql.Date;
import java.time.Instant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.backend.model.entity.Message;
import com.example.backend.model.entity.Reply;
import com.example.backend.model.entity.UserEntity;
import com.example.backend.repository.MessageJpaRepository;
import com.example.backend.repository.UserEntityJpaRepository;

@SpringBootTest
public class RelationsTest {

    private final UserEntityJpaRepository userEntityJpaRepository;
    private final MessageJpaRepository messageJpaRepository;

    @Autowired
    public RelationsTest(UserEntityJpaRepository userEntityJpaRepository, MessageJpaRepository messageJpaRepository) {
        this.userEntityJpaRepository = userEntityJpaRepository;
        this.messageJpaRepository = messageJpaRepository;
    }

    @Test
    public void test() {
        UserEntity user = new UserEntity("test", "test");
        user = userEntityJpaRepository.save(user);
        Date messageDate = Date.valueOf("2021-01-01");
        Message message = new Message("test", messageDate, user);
        message = messageJpaRepository.save(message);
        Date replyDdate = Date.valueOf("2021-01-02");
        Reply reply = new Reply("test", replyDdate, user, message);
        reply = messageJpaRepository.save(reply);
        System.out.println("AAAAAAAAAAAAAAAAA");
        userEntityJpaRepository.findAll().forEach(System.out::println);
        messageJpaRepository.findAll().forEach(System.out::println);

    }

}

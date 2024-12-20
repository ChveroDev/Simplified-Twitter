package com.example.backend.model.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Reply extends Message {
    @ManyToOne
    private Message replyTo;

    public Reply(String text, Date date, UserEntity user, Message replyTo) {
        super(text, date, user);
        this.replyTo = replyTo;
    }

    @Override
    public String toString() {
        return super.toString() + "Reply [replyTo=" + replyTo + "]";
    }

}

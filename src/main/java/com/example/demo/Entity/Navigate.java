package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Navigate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String topic;

    public Navigate() {
    }

    public Navigate(String topic) {
        this.topic = topic;
    }

    public Navigate(long id, String topic) {
        this.id = id;
        this.topic = topic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}

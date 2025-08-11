package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;
    private long topicId;
    private String teacherName;
    private double teacherRating;
    private String link;

    public Topic() {
    }

    public Topic(int teacherId, long topicId, String teacherName, double teacherRating, String link) {
        this.teacherId = teacherId;
        this.topicId = topicId;
        this.teacherName = teacherName;
        this.teacherRating = teacherRating;
        this.link = link;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public long getTopicId() {
        return topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getTeacherRating() {
        return teacherRating;
    }

    public void setTeacherRating(double teacherRating) {
        this.teacherRating = teacherRating;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

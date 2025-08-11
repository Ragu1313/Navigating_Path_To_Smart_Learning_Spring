package com.example.demo.Model;



public class RatingWrapper {
    private Long topicId;
    private int teacherId   ;
    private String userEmail;
    private int rating;

    public RatingWrapper() {
    }

    public RatingWrapper(Long topicId, int teacherId, String userEmail, int rating) {
        this.topicId = topicId;
        this.teacherId = teacherId;
        this.userEmail = userEmail;
        this.rating = rating;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

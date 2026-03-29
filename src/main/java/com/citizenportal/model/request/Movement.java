package com.citizenportal.model.request;

import com.citizenportal.model.user.User;
import java.time.LocalDateTime;

public class Movement {
    private String description;
    private LocalDateTime createdAt;
    private User user;

    public Movement() {
    }

    public Movement(String description, LocalDateTime createdAt, User user) {
        this.description = description;
        this.createdAt = createdAt;
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
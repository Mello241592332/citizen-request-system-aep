package com.citizenrequestsystem.model.request;

import com.citizenrequestsystem.model.user.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Solicitação de serviço público
public class Request {
    private String protocol;
    private Category category;
    private String description;
    private String location;
    private String neighborhood;
    private Status status;
    private Priority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime slaDeadline;
    private String delayJustification;
    private boolean isAnonymous;
    private User user;
    private List<Attachment> attachments;
    private List<Movement> movements;
    private Sector sector;

    public Request() {
        this.attachments = new ArrayList<>();
        this.movements = new ArrayList<>();
    }

    public Request(String protocol, String description, User user) {
        this.protocol = protocol;
        this.description = description;
        this.user = user;
        this.attachments = new ArrayList<>();
        this.movements = new ArrayList<>();
        this.status = Status.EM_ANDAMENTO;      // por exemplo
        this.priority = Priority.MEDIA;   // valor default
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getSlaDeadline() {
        return slaDeadline;
    }

    public void setSlaDeadline(LocalDateTime slaDeadline) {
        this.slaDeadline = slaDeadline;
    }

    public String getDelayJustification() {
        return delayJustification;
    }

    public void setDelayJustification(String delayJustification) {
        this.delayJustification = delayJustification;
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
        if (anonymous) {
            this.user = null;
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Movement> getMovements() {
        return movements;
    }

    public void setMovements(List<Movement> movements) {
        this.movements = movements;
    }
}
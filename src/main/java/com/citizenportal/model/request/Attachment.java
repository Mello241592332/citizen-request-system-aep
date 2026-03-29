package com.citizenportal.model.request;

import java.time.LocalDateTime;

public class Attachment {
    private String fileName;
    private String fileType;
    private String fileUrl;
    private LocalDateTime uploadedAt;

    public Attachment() {
    }

    public Attachment(String fileName, String fileType, String fileUrl, LocalDateTime uploadedAt) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileUrl = fileUrl;
        this.uploadedAt = uploadedAt;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }
}
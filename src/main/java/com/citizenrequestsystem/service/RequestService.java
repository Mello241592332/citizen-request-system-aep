package com.citizenrequestsystem.service;

import com.citizenrequestsystem.model.request.Request;
import java.util.ArrayList;
import java.util.List;

public class RequestService {
    private List<Request> requests = new ArrayList<>();

    public void createRequest(Request request) {
        requests.add(request);
    }

    public List<Request> getAllRequests() {
        return requests;
    }
}
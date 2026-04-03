package com.citizenrequestsystem.controller;

import com.citizenrequestsystem.model.request.Request;
import com.citizenrequestsystem.service.RequestService;

import java.util.List;
import java.util.Scanner;

public class RequestController {
    private RequestService requestService;

    public RequestController(RequestService service) {
        this.requestService = service;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1 - Create Request");
            System.out.println("2 - List Requests");
            System.out.println("0 - Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (option) {
                case 1 -> createRequest(sc);
                case 2 -> listRequests();
                case 0 -> { System.out.println("Exiting..."); return; }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    private void createRequest(Scanner sc) {
        System.out.print("Enter protocol: ");
        String protocol = sc.nextLine();
        System.out.print("Enter description: ");
        String desc = sc.nextLine();

        Request req = new Request(protocol, desc, null);
        requestService.createRequest(req);
        System.out.println("Request created!");
    }

    private void listRequests() {
        List<Request> requests = requestService.getAllRequests();
        if (requests.isEmpty()) {
            System.out.println("No requests found!");
        } else {
            for (Request r : requests) {
                System.out.println("Protocol: " + r.getProtocol() + ", Description: " + r.getDescription());
            }
        }
    }
}
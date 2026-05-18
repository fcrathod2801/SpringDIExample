package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    private final MessageService service;

    @Autowired
    public Notification(MessageService service) {
        this.service = service;
    }

    public void notifyUser() {

        service.sendMessage();
    }
}

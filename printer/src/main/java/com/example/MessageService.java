package com.example;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {
    public MessageService() {
    }

    Message findById(String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://localhost:8081/messages/search/findById?id=%s", id);
        return restTemplate.getForObject(url, Message.class);
    }
}
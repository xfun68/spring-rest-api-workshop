package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PrintController {

    private final MessageService messageService;

    @Autowired
    public PrintController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(value = "/print", method = GET)
    public Message printMessageById(@RequestParam("id") String id) {
        return messageService.findById(id);
    }

}

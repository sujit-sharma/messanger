package com.sujit.messagesender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MessageSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageSenderApplication.class, args);
    }

}

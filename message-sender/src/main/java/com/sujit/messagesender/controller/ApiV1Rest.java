package com.sujit.messagesender.controller;

import com.sujit.messagesender.test.messageSendTest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/message/send")
public class ApiV1Rest {
    private final messageSendTest messageSendTest;

    @PostMapping
    public ResponseEntity<Object> sendMessage() {
        messageSendTest.sendMessage();
        return ResponseEntity.ok("Successfully sent message");
    }
}

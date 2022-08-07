package com.sujit.messagesender.test;

import com.sujit.messagesender.config.RabbitConverterConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Slf4j
@Component
public class messageSendTest {

    public final RabbitTemplate rabbitTemplate;

//    @Value("${user.exchange.name}")
    private  final String userExchangeName="user.exchange";


    public void sendMessage() {
       log.info("Sending message to queue");

       while (true) {
           String message = "Hello messaging appppppp";
           rabbitTemplate.convertAndSend(userExchangeName, "*", message);
       }

   }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("Application  started successfully . Now sending message to queue");
        this.sendMessage();
    }
}

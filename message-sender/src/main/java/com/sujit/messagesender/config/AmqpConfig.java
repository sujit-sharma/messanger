package com.sujit.messagesender.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfig {

    @Bean
    Queue queue(@Value("${user.queue.name}") final String queueName) {
        return new Queue(queueName);
    }


    @Bean
    TopicExchange exchange(@Value("${user.exchange.name}") final String topicName) {
        return new TopicExchange(topicName);
    }


    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("user-message-q");
    }

}

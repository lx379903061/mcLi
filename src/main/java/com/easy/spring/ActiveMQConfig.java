package com.easy.spring;
import javax.jms.Destination;
import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
/**
 * Author: xf
 * Version: 1.0
 * Create Date Time: 2018/12/27 10:44.
 * Update Date Time:
 */
@Configuration
@EnableJms
public class ActiveMQConfig {
    @Bean
    public Destination test_queue() {
        return new ActiveMQQueue("test_queue") ;
    }
}

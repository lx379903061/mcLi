package com.easy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * 消息消费者
 * Author: xf
 * Version: 1.0
 * Create Date Time: 2018/12/27 11:14.
 * Update Date Time:
 */
@Service
public class MessageConsumer {
    @Autowired
    private JmsMessagingTemplate jmsTemplate;
    @Resource(name="test_queue")
    private Destination queue;

    public String getMessage(){
        return jmsTemplate.receiveAndConvert(queue,String.class);
    }
}

package com.easy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * 消息生产者
 * Author: xf
 * Version: 1.0
 * Create Date Time: 2018/12/27 10:43.
 * Update Date Time:
 */
@Service
public class MessageProducer {
    @Autowired
    private JmsMessagingTemplate jmsTemplate;
    @Resource(name="test_queue")
    private Destination queue;

    //发送
    public void sendMsg(String msg){
        jmsTemplate.convertAndSend(queue,msg);
    }
}

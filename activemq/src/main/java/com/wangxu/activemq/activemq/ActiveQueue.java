package com.wangxu.activemq.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 * @author wangxu
 * @date 2021/9/6
 */
@Component
public class ActiveQueue {

    @Autowired
    public Queue queue;

    @Autowired
    public JmsMessagingTemplate jmsTemplate;

    public void sendMessage(String message){
        this.jmsTemplate.convertAndSend(this.queue,message);
    }

    @JmsListener(destination = "queue.one",containerFactory = "queueListenerFactory")
    public void receiveMsg(String message){
        System.out.println(message);
    }
}

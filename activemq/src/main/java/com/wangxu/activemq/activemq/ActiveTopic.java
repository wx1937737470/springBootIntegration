package com.wangxu.activemq.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * @author wangxu
 * @date 2021/9/6
 */
@Component
public class ActiveTopic {

    @Autowired
    public Topic topic;

    @Autowired
    public JmsTemplate jmsTemplate;

    public void sendMessage(String message){
        this.jmsTemplate.convertAndSend(this.topic,message);
    }

    @JmsListener(destination = "topic.one",containerFactory = "topicListenerFactory")
    public void receiveMsg(String message){
        System.out.println(message);
    }
}

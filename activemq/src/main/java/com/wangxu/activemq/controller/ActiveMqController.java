package com.wangxu.activemq.controller;

import com.wangxu.activemq.activemq.ActiveQueue;
import com.wangxu.activemq.activemq.ActiveTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxu
 * @date 2021/9/7
 */
@RestController
public class ActiveMqController {

    @Autowired
    private ActiveQueue activeQueue;

    @Autowired
    private ActiveTopic activeTopic;

    @GetMapping("/sendQueue")
    public void sendMassageQueue(String massage){
        activeQueue.sendMessage(massage);
    }

    @GetMapping("/sendTopic")
    public void sendMassageTopic(String massage){
        activeTopic.sendMessage(massage);
    }
}

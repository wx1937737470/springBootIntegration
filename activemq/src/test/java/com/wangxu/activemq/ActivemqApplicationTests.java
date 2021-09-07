package com.wangxu.activemq;

import com.wangxu.activemq.activemq.ActiveQueue;
import com.wangxu.activemq.activemq.ActiveTopic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivemqApplicationTests {

    @Autowired
    private ActiveQueue activeQueue;

    @Autowired
    private ActiveTopic activeTopic;

    @Test
    void contextLoads() {
        activeQueue.sendMessage("发送数据");
    }

}

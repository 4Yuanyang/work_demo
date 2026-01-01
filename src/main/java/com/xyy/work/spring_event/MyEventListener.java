package com.xyy.work.spring_event;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class MyEventListener {

    Logger logger = LoggerFactory.getLogger(MyEventListener.class);
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    @Transactional
    public void handel(MyEvent event) {
        logger.info("当前用户{}触发事件", event.getName());
    }
}

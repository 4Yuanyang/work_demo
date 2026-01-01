package com.xyy.work.spring_event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MyEventService {
    private final ApplicationEventPublisher myPublisher;

    public void publish() {
        MyEvent event = new MyEvent();
        event.setName("张三");
        myPublisher.publishEvent(event);
    }
}

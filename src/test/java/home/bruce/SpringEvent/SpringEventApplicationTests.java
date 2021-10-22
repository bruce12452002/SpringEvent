package home.bruce.SpringEvent;

import home.bruce.SpringEvent.event.MyEvent;
import home.bruce.SpringEvent.event.MyEvent2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringEventApplication.class)
class SpringEventApplicationTests {
    @Resource
    private ApplicationEventPublisher applicationEventPublisher; // ApplicationContext 會繼承這個介面

    @Test
    void testMyEvent() {
        applicationEventPublisher.publishEvent(new MyEvent("xxx"));
    }

    @Test
    void testMyEvent2() {
        applicationEventPublisher.publishEvent(new MyEvent2("ooo"));
    }

}

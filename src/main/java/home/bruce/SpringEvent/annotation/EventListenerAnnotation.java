package home.bruce.SpringEvent.annotation;

import home.bruce.SpringEvent.event.MyEvent;
import home.bruce.SpringEvent.event.MyEvent2;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerAnnotation {
    //    @EventListener(ApplicationEvent.class) // 效果等同 MyApplicationListener
    public void xxx(ApplicationEvent applicationEvent) {
        System.out.println("annotation1=" + applicationEvent);
    }

    @EventListener({MyEvent.class, MyEvent2.class}) // 可用來取代 ApplicationListener<XxxEvent>，也可兩者都用
    public void ooo(ApplicationEvent applicationEvent) {
        System.out.println("annotation2=" + applicationEvent);
    }
}

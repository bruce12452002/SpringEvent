package home.bruce.SpringEvent.annotation;

import home.bruce.SpringEvent.event.MyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerAnnotation {
    //    @EventListener(ApplicationEvent.class) // 效果等同 MyApplicationListener
    public void xxx(ApplicationEvent applicationEvent) {
        System.out.println("annotation1=" + applicationEvent);
    }

    //    @EventListener({MyEvent.class, MyEvent2.class}) // 可用來取代 ApplicationListener<XxxEvent>，也可兩者都用
    public void ooo(ApplicationEvent applicationEvent) {
        System.out.println("annotation2=" + applicationEvent);
    }

    @EventListener
    public void qoo(MyEvent myEvent) { // 這種寫法只能一個參數
        System.out.println("@EventListener.myEvent=" + myEvent);
    }
}

package home.bruce.SpringEvent.event;

import org.springframework.context.ApplicationEvent;


public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        System.out.println("myEvent.source=" + source);
    }

}

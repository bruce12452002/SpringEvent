package home.bruce.SpringEvent.event;

import org.springframework.context.ApplicationEvent;


public class MyEvent2 extends ApplicationEvent {
    public MyEvent2(String source) {
        super(source);
        System.out.println("myEvent2.source=" + source);
    }

}

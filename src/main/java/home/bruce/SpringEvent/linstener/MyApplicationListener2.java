package home.bruce.SpringEvent.linstener;

import home.bruce.SpringEvent.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener2 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("MyApplicationListener2.myEvent=" + event);
    }
}

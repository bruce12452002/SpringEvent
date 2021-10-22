package home.bruce.SpringEvent.linstener;

import home.bruce.SpringEvent.event.MyEvent2;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener3 implements ApplicationListener<MyEvent2> {
    @Override
    public void onApplicationEvent(MyEvent2 event) {
        System.out.println("MyApplicationListener3.myEvent=" + event);
    }
}

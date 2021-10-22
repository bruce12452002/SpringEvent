package home.bruce.SpringEvent.linstener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("default applicationEvent=" + event);
        // 預設的 ApplicationEvent，只要有 @Component，啟動時就會觸發，控制台可看到
    }
}

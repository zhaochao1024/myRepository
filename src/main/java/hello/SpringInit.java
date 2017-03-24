package hello;

import com.myspringdemo.service.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by treebear on 2017/3/22.
 */
public class SpringInit {

    public static void main(String []args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"application.xml"});

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);
        service.sayHello("wocaonimapw");
    }

}

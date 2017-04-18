package hello;

import com.myspringdemo.controller.JSRResourceController;
import com.myspringdemo.dao.ComponentScanExcludeDao;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by treebear on 2017/3/22.
 */
public class SpringInit {

    public static void main(String []args){

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"application.xml"});

        // retrieve configured instance
//        PetStoreService service = context.getBean("petStore", PetStoreService.class);
//        ExampleBean exampleBean = context.getBean("exampleBean",ExampleBean.class);
//        exampleBean.toString();
//        service.sayHello("wocaonimapw");

//        ComplexObject complexObject = context.getBean("moreComplexObject", ComplexObject.class);
//        List someList = complexObject.getSomeList();
//        System.out.println(someList);

//        context.close();


        /**
         * spring 生命周期demo
         */

//        LifeycycleService lifecycleService = context.getBean("lifecycleService", LifeycycleService.class);
//
//        lifecycleService.printf();
//        context.close();


        /**
         * override properties
         */

//        PetStoreServiceImpl service = context.getBean("petStoreServiceImpl", PetStoreServiceImpl.class);
//
//        System.out.println(service.getSimpleString());


        /**
         * 验证spring中getBean("beanName")返回FactoryBean生产的Bean实例，getBean("&beanName")返回FactoryBean
         */

//        java.lang.Object petStore = context.getBean("&petStore");
//
//        System.out.println("factory bean : " + petStore);

        /**
         * autoWired Collections
         */

//        AutoWiredCollectionsController autoWiredCollectionsController = context.getBean("autoWiredCollectionsController", AutoWiredCollectionsController.class);
//
//        System.out.println("AutoWiredCollectionsController autowired Collections:"+autoWiredCollectionsController.getLifeycycleServices());
//
//        System.out.println("AutoWiredCollectionsController autowired Map:"+autoWiredCollectionsController.getLifeycycleServiceMap());


        /**
         * autowired primary
         *
         */
//        AutoWiredPrimaryController autoWiredPrimaryController = context.getBean("autoWiredPrimaryController",AutoWiredPrimaryController.class);
//
//        System.out.println("autowired primary : " + autoWiredPrimaryController.getLifeycycleService().getClass().getName());
//
//        System.out.println("autowired Qualifier : " + autoWiredPrimaryController.getSimpleMovieCatalog().getName());

        /**
         * autowired qualifier
         *
         */

        /**
         * autowired @Resource
         */
//        JSRResourceController jsrResourceController = context.getBean("jsrResourceController",JSRResourceController.class);
//
//        System.out.println(jsrResourceController.getMovieFinder());


        /**
         *  验证componentSacn 过滤掉@Respsitory
         */

        ComponentScanExcludeDao componentScanExcludeDao = context.getBean("COMPONENTSCANEXCLUDEDAO",ComponentScanExcludeDao.class);

        System.out.println(componentScanExcludeDao.getName());
    }


}

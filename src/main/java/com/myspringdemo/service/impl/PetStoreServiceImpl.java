package com.myspringdemo.service.impl;

import com.myspringdemo.service.PetStoreService;
import examples.ExampleBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by treebear on 2017/3/22.
 */
@Service
public class PetStoreServiceImpl implements PetStoreService,InitializingBean{


    private String simpleString;


    public String getSimpleString() {
        return simpleString;
    }

//    @Required
    public void setSimpleString(String simpleString) {
        this.simpleString = simpleString;
    }

    public int getSimpleInt() {
        return simpleInt;
    }

    public void setSimpleInt(int simpleInt) {
        this.simpleInt = simpleInt;
    }

    public ExampleBean getExampleBean() {
        return exampleBean;
    }

    public void setExampleBean(ExampleBean exampleBean) {
        this.exampleBean = exampleBean;
    }

    private int  simpleInt;

    private ExampleBean exampleBean;

    public PetStoreServiceImpl(String simpleString,int simpleInt){
        this.simpleString = simpleString;
        this.simpleInt = simpleInt;
    }

    public PetStoreServiceImpl(){}
    public String sayHello(String content) {
        System.out.println(content);
        System.out.println("simpleString: " + simpleString);
        System.out.println("simpleInt : " + simpleInt);
        return content;
    }
//    public static void initMethod(){
//        System.out.println("wocaonimapw2");
//    }
//
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is Called Here");
    }
//
    @PreDestroy
    public void preDestroy(){

        System.out.println("preDestroy here !");
    }

    @PostConstruct
    public void PostConstruct(){

        System.out.println("PostConstruct here !");
    }

    public void initMethod(){

        System.out.println("initMethod !!!");
    }

}

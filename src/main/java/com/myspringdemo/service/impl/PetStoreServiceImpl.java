package com.myspringdemo.service.impl;

import com.myspringdemo.service.PetStoreService;

/**
 * Created by treebear on 2017/3/22.
 */
public class PetStoreServiceImpl implements PetStoreService {

    private String simpleString;

    private int  simpleInt;

    public PetStoreServiceImpl(String simpleString,int simpleInt){
        this.simpleString = simpleString;
        this.simpleInt = simpleInt;
    }
    public String sayHello(String content) {
        System.out.println(content);
        System.out.println("simpleString: " + simpleString);
        System.out.println("simpleInt : " + simpleInt);
        return content;
    }
}

package com.myspringdemo.service.impl;

import com.myspringdemo.service.LifeycycleService;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

/**
 * Created by treebear on 2017/4/10.
 */


@Service
public class LifeycycleServiceImpl2 implements LifeycycleService {

    public void printf() {
        System.out.println("printf");
    }

}

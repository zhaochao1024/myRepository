package com.myspringdemo.service.impl;

import com.myspringdemo.service.LifeycycleService;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

/**
 * Created by treebear on 2017/4/10.
 */


@Service
public class LifeycycleServiceImpl implements LifeycycleService,SmartLifecycle,Runnable {

    public boolean isAutoStartup() {
        return true;
    }

    public void stop(Runnable callback) {
        System.out.println("lifecycle stop !!!");
    }

    public void start() {
        System.out.println("lifecycle start !!!");
    }

    public void stop() {

    }

    public boolean isRunning() {
        return true;
    }

    public int getPhase() {
        return 0;
    }

    public void printf() {
        System.out.println("printf");
    }

    public void run() {
        System.out.println("lifecycle sotp !!!");
    }
}

package com.myspringdemo.controller;

import com.myspringdemo.service.LifeycycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;
import java.util.Set;

/**
 * Created by treebear on 2017/4/12.
 */

@Controller
public class AutoWiredCollectionsController {

    public Set<LifeycycleService> getLifeycycleServices() {
        return lifeycycleServices;
    }


    public void setLifeycycleServices(Set<LifeycycleService> lifeycycleServices) {
        this.lifeycycleServices = lifeycycleServices;
    }

    public Map<String, LifeycycleService> getLifeycycleServiceMap() {
        return lifeycycleServiceMap;
    }

    public void setLifeycycleServiceMap(Map<String, LifeycycleService> lifeycycleServiceMap) {
        this.lifeycycleServiceMap = lifeycycleServiceMap;
    }

    @Autowired
    private Set<LifeycycleService> lifeycycleServices;

    @Autowired
    private Map<String,LifeycycleService> lifeycycleServiceMap;


}

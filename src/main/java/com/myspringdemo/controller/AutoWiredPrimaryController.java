package com.myspringdemo.controller;

import com.myspringdemo.service.LifeycycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.Map;
import java.util.Set;

/**
 * Created by treebear on 2017/4/12.
 */

@Controller
public class AutoWiredPrimaryController {

    public LifeycycleService getLifeycycleService() {
        return lifeycycleService;
    }

    public void setLifeycycleService(LifeycycleService lifeycycleService) {
        this.lifeycycleService = lifeycycleService;
    }

    public SimpleMovieCatalog getSimpleMovieCatalog() {
        return simpleMovieCatalog;
    }

    public void setSimpleMovieCatalog(SimpleMovieCatalog simpleMovieCatalog) {
        this.simpleMovieCatalog = simpleMovieCatalog;
    }

    @Autowired

    private LifeycycleService lifeycycleService;

    @Autowired
    @Qualifier("main")
    private SimpleMovieCatalog simpleMovieCatalog;

}

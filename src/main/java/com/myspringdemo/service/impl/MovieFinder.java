package com.myspringdemo.service.impl;

import org.springframework.stereotype.Service;

/**
 * Created by treebear on 2017/4/13.
 */
@Service
public class MovieFinder {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

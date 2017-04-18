package com.myspringdemo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by treebear on 2017/4/17.
 *
 */
//@Repository
@Component
public class ComponentScanExcludeDao {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "helloworld";

}

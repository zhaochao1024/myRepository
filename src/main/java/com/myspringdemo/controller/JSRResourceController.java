package com.myspringdemo.controller;

import com.myspringdemo.service.impl.MovieFinder;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by treebear on 2017/4/13.
 */
@Controller(value = "jsrResourceController")
public class JSRResourceController {
    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    @Resource
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

//    @Resource(name="movieFinder")
    private MovieFinder movieFinder;
}

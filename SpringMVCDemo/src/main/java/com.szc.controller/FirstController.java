package com.szc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by szc on 16/7/6.
 */
@Controller
@RequestMapping(value="/first")
public class FirstController {

    @RequestMapping(value = "testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("receive the request!!!");
        return null;
    }

}

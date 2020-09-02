package com.aineurontech.StudentInfoServices.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Messages {

    @RequestMapping("/message")
    public List<String> getMessage(){
        List<String> list = new ArrayList<>();
        list.add("Good Morning !");
        list.add("Good Afternoon !");
        list.add("Good Evening !");

        return list;
    }
}

package com.example.hw11;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(path = "/name")
    public String name(){
        return "My name is Nasser Naif";
    }

    @GetMapping(path = "/age")
    public String  age(){
        return "My age is 23";
    }

    @GetMapping(path = "/check/status")
    public String check(){
        return "Everything is Okay";
    }

    @GetMapping(path = "/health")
    public String health(){
        return "server health is up and runnig";
    }

    @GetMapping(path = "/names")
    public String[] names(){
        String[] names = {"Nasser","Naif","Mohammed","Maha"};
        return names;
    }
}

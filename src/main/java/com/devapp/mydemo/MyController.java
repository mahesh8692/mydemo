package com.devapp.mydemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping(value = "/test")
    public String myTest(){

        return "data from servere";
    }

}

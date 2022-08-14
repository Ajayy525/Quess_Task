package com.quesss.MicroServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ObjectInputFilter;

@RestController
public class controler {
    @Autowired
    private config Config;
    @GetMapping("/mxmn")
    public config retrveMxMn(){
        return new config(Config.getMx(),Config.getMn());
    }


}


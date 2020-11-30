package com.kishore.kamal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lc")
public class LCController {

    @GetMapping("")
    public String index(){
        return "index-page";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam String yourName, @RequestParam String crushName){
        return "index-page";
    }

}

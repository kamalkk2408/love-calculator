package com.kishore.kamal.controller;

import com.kishore.kamal.dto.RequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lc")
public class LCController {

    @GetMapping("")
    public String index(@ModelAttribute("request") RequestDto requestDto) {
        return "index-page";
    }

    @GetMapping("/calculate")
    public String calculate(@ModelAttribute("request") RequestDto requestDto){
        return "result-page";
    }

}

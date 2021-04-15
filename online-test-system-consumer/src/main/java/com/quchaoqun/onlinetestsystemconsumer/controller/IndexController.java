package com.quchaoqun.onlinetestsystemconsumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("paper")
    public String self(){
        return "paper_info";
    }
}

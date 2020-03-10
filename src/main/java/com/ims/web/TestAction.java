package com.ims.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestAction {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(Model model) {
        model.addAttribute("message", "StringMvc你好");
        return "hello";
    }
}

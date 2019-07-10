package com.smbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloMvc {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "index";
    }

    @RequestMapping(value = "/toRegister")
    public String testRegister(){
        return "regeister";
    }

    @RequestMapping(value = "/doRegister")
    public String doRegister(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        model.addAttribute("username",username);
        return "doRegister";
    }
}

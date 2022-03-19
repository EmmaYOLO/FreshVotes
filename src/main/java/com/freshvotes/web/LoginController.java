package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Emma_Lyy
 * @create 2022-03-19 21:00
 */

@Controller
public class LoginController {

//    @RequestMapping( value = "/login",method = RequestMethod.GET)
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}

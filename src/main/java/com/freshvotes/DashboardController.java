package com.freshvotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Emma_Lyy
 * @create 2022-03-18 22:24
 */
@Controller
public class DashboardController {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String rootView () {//这个方法名随便起，对什么都不影响
//        return "/src/main/resources/index.html";
//        本来是要这样写的，但spring为我们省略了哪些，把省略的部分直接作为defaul值了。
        return "index";
    }




}

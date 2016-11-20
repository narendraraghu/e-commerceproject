package com.springframework.ecommerce.controllers;

import com.springframework.ecommerce.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("Exception in hello Method");
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("My Exception in JSON Format");
    }

    @RequestMapping("/hello1")
    public String index(ModelMap map) {
        map.addAttribute("host", "Narendra Raghuwanshi");
        return "learning/index";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }


}
package cn.jacken.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user/getUser")
    public  String  getUser(){
        return "wangqiang";
    }
}

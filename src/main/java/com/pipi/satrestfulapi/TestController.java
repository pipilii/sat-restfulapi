package com.pipi.satrestfulapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

//controller用於處理前端傳進來的request
// http://localhost:8080/login
@RestController     //當前端有個 login request時，讓Spring boot自動導入到login方法裡
public class TestController {
    @Qualifier("registerSuccessEvent")
    @Autowired
    private Event event;
    @GetMapping("/login")   //放URI
    public String login(){
        return "login success";
    }
    @GetMapping("/register-success")   //放URI
    public String bookCourseEvent(){
        return event.dispatch("pi");
    }

    @PostMapping("/register-success")
    public String postCourseEvent(){
        return "postRegisterSuccess";
    }

    @PutMapping("/register-success/1")
    public String putCourseEvent(){
        return "putRegisterSuccess";
    }

    @DeleteMapping("/register-success/2")
    public String deleteCourseEvent(){
        return "deleteRegisterSuccess";
    }

}

package com.example.Spring_secex.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//checking the spring security dependency and getting the session id

@RestController
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "Hello from spring secex";
    }

    @GetMapping("/sessionid")
    public String getsessionid(HttpServletRequest request){
        return request.getSession().getId();
    }

    @GetMapping("/csrftoken")
    public CsrfToken getcsrftoken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}

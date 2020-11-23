package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private UserService userService;

    @GetMapping("/")
    public String index(){
        return "/index";
    }

    @GetMapping("/user/signup")
    public String Signup(){
        return "/signup";
    }

    @PostMapping("/user/signup")
    public String Signup(UserDto UserDto){
        userService.joinUser(UserDto);
        return "redirect:/user/login";
    }

    @GetMapping("/user/login")
    public String dispLogin() {
        return "/login";
    }

    @GetMapping("/user/login/result")
    public String dispLoginResult() {
        return "/loginSuccess";
    }

    @GetMapping("/user/logout/result")
    public String Logout() {
        return "/logout";
    }

    @GetMapping("/user/denied")
    public String Denied() {
        return "/denied";
    }

    @GetMapping("/user/info")
    public String MyInfo() {
        return "/myinfo";
    }

    @GetMapping("/admin")
    public String Admin() {
        return "/admin";
    }

}

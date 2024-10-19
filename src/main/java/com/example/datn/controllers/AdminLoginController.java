package com.example.datn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminLoginController {
    @GetMapping("/admin-login")
    public String viewAdminLoginPage() {
        return "/admin/login";
    }
}

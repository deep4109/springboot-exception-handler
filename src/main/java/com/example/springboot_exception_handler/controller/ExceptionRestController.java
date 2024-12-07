package com.example.springboot_exception_handler.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionRestController {

    @GetMapping("/roleadd")
    public void add() {
        int num = 10 / 0;
    }
}

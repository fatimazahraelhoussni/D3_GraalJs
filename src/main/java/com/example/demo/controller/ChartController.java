package com.example.demo.controller;


import com.example.demo.service.JavaScriptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public class ChartController {

    private final JavaScriptService javaScriptService;

    public ChartController(JavaScriptService javaScriptService) {
        this.javaScriptService = javaScriptService;
    }

    @GetMapping
    public String getChart() {
        return javaScriptService.generateChart();
    }
}


package com.sonu.WeatherForecast;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String greet()
    {
        return "Hello World";
    }
}

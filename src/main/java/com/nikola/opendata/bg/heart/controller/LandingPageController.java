package com.nikola.opendata.bg.heart.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LandingPageController {

    @RequestMapping("/")
    public String index() {
        return "This will be a very cool application! Just wait and see!<br>Needs a bit of time to hatch.";
    }
}

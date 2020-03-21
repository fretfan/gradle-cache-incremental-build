package com.seroga.web1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web1Controller {

    @GetMapping("/1")
    public String getWeb1() {
        return "This is web1";
    }
}

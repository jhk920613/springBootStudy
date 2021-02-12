package com.chklab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiResource {

    @GetMapping(value = "/api/test")
    public String getApiTest() {

        return "{\"result\": \"ok\"}";
    }

}

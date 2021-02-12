package com.chklab.rest;


import com.chklab.lifecycle.ServiceLifeCycle;
import com.chklab.spec.ApiTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/apiTest")
public class ApiTestResource {

    private final ApiTestService apiTestService;

    public ApiTestResource(ServiceLifeCycle serviceLifeCycle) {
        this.apiTestService = serviceLifeCycle.requestApiTestService();
    }

    @GetMapping(path = "/get")
    public String getApi() {
        return this.apiTestService.getApiTest();
    }

}

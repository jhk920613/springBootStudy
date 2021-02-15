package com.chklab.rest;


import com.chklab.entity.ApiTest;
import com.chklab.lifecycle.ServiceLifeCycle;
import com.chklab.spec.ApiTestService;
import com.chklab.util.GsonUtil;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(path = "/apiTest")
public class ApiTestResource {

    private final ApiTestService apiTestService;

    public ApiTestResource(ServiceLifeCycle serviceLifeCycle) {
        this.apiTestService = serviceLifeCycle.requestApiTestService();
    }


    @PostMapping
    public ApiTest register(@RequestBody ApiTest apiTest) {
        System.out.println("엥??");
        return this.apiTestService.register(apiTest);
    }

    @GetMapping(path = "/{name}")
    public ApiTest find(@PathVariable("name") String name) {
        return this.apiTestService.find(name);
    }

    @PutMapping
    public ApiTest modify(@RequestBody ApiTest apiTest) {
        return this.apiTestService.modify(apiTest);
    }

    @DeleteMapping(path = "/{name}")
    public void remove(@PathVariable("name") String name) {
        this.apiTestService.remove(name);
    }

    @GetMapping(path = "/findAll")
    public List<ApiTest> findAll() {
        return this.apiTestService.findAll();
    }
}

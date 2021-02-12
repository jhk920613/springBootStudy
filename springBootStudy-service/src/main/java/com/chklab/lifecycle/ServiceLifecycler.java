package com.chklab.lifecycle;

import com.chklab.spec.ApiTestService;
import org.springframework.stereotype.Component;

@Component
public class ServiceLifecycler implements ServiceLifeCycle {

    private final ApiTestService apiTestService;

    public ServiceLifecycler(ApiTestService apiTestService) {
        this.apiTestService = apiTestService;
    }


    @Override
    public ApiTestService requestApiTestService() {
        return this.apiTestService;
    }
}

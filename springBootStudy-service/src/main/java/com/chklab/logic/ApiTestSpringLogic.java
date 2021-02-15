package com.chklab.logic;

import com.chklab.lifecycle.StoreLifeCycle;
import org.springframework.stereotype.Service;

@Service
public class ApiTestSpringLogic extends ApiTestLogic {
    public ApiTestSpringLogic(StoreLifeCycle storeLifeCycle) {
        super(storeLifeCycle);
    }
}

package com.chklab.logic;

import com.chklab.entity.ApiTest;
import com.chklab.lifecycle.StoreLifeCycle;
import com.chklab.spec.ApiTestService;
import com.chklab.store.ApiTestStore;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public class ApiTestLogic implements ApiTestService {

    private final ApiTestStore apiTestStore;

    public ApiTestLogic(StoreLifeCycle storeLifeCycle) {
        this.apiTestStore = storeLifeCycle.requestApiTestStore();
    }

    @Override
    public ApiTest register(ApiTest apiTest) {

        return this.apiTestStore.create(apiTest);
    }

    @Override
    public ApiTest find(String name) {

        return this.apiTestStore.retrieve(name);
    }

    @Override
    public ApiTest modify(ApiTest apiTest) {

        return this.apiTestStore.update(apiTest);
    }

    @Override
    public void remove(String name) {

        this.apiTestStore.delete(name);
    }

    @Override
    public List<ApiTest> findAll() {

        return this.apiTestStore.findAll();
    }
}

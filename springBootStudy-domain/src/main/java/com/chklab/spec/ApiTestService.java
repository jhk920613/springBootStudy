package com.chklab.spec;

import com.chklab.entity.ApiTest;

import java.sql.Timestamp;
import java.util.List;

public interface ApiTestService {

    ApiTest register(ApiTest apiTest);

    ApiTest find(String name);

    ApiTest modify(ApiTest apiTest);

    void remove(String name);

    List<ApiTest> findAll();

    List<ApiTest> findByStatus(Integer status);

}

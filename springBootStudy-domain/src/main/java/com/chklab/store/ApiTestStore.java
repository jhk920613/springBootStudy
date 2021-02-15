package com.chklab.store;

import com.chklab.entity.ApiTest;

import java.sql.Timestamp;
import java.util.List;

public interface ApiTestStore {

    ApiTest create(ApiTest apiTest);

    ApiTest retrieve(String name);

    ApiTest update(ApiTest apiTest);

    void delete(String name);

    List<ApiTest> findAll();

}

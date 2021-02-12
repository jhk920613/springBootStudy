package com.chklab.logic;

import com.chklab.entity.ApiTestEntity;
import com.chklab.spec.ApiTestService;
import com.google.gson.Gson;

import java.math.BigDecimal;

public class ApiTestLogic implements ApiTestService {

    @Override
    public String getApiTest() {
        ApiTestEntity apiTestEntity = new ApiTestEntity();
        apiTestEntity.setStatus(new BigDecimal(200));
        apiTestEntity.setComment("Api 조회 성공");

        Gson gson = new Gson();

        return gson.toJson(apiTestEntity);
    }
}

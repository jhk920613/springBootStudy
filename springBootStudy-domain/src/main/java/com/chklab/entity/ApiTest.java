package com.chklab.entity;

import com.chklab.logic.util.GsonUtil;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Getter
@Setter
public class ApiTest {

    private String name;
    private Integer status;
    private String comment;

}

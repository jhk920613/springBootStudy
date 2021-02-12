package com.chklab.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ApiTestEntity {

    private BigDecimal status;
    private String comment;

}

package com.chklab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApp {

    public static void main(String[] args) {
        // 스프링 부트 프로젝트를 시작한다는 명시
        // Start 컨트롤러 생성
        SpringApplication.run(StartApp.class, args);
    }

}

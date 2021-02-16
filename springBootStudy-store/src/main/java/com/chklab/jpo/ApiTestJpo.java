package com.chklab.jpo;

import com.chklab.entity.ApiTest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="sample")
public class ApiTestJpo {

    @Id
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "status", nullable = false)
    private Integer status;
    @Column(name = "comment", nullable = false)
    private String comment;

    public ApiTestJpo(ApiTest apiTest) {
        BeanUtils.copyProperties(apiTest, this);
    }

    public ApiTest toDomain() {
        ApiTest apiTest = new ApiTest();
        BeanUtils.copyProperties(this, apiTest);

        return apiTest;
    }

    public static List<ApiTest> toDomains(Iterable<ApiTestJpo> apiTestJpos) {
        return StreamSupport.stream(apiTestJpos.spliterator(), false)
                .map(ApiTestJpo::toDomain)
                .collect(Collectors.toList());
    }

}

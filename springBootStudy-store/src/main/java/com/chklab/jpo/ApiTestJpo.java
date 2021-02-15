package com.chklab.jpo;

import com.chklab.entity.ApiTest;
import com.chklab.util.GsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ApiTestJpo {

    @Id
    private String name;
    private BigDecimal status;
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

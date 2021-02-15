package com.chklab;

import com.chklab.entity.ApiTest;
import com.chklab.jpo.ApiTestJpo;
import com.chklab.repository.ApiTestRepository;
import com.chklab.store.ApiTestStore;
import com.chklab.util.GsonUtil;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ApiTestJpaStore implements ApiTestStore {

    private final ApiTestRepository apiTestRepository;

    public ApiTestJpaStore(ApiTestRepository apiTestRepository) {
        this.apiTestRepository = apiTestRepository;
    }

    @Override
    public ApiTest create(ApiTest apiTest) {
        ApiTestJpo apiTestJpo = new ApiTestJpo(apiTest);

        return this.apiTestRepository.save(apiTestJpo).toDomain();
    }

    @Override
    public ApiTest retrieve(String name) {
        Optional<ApiTestJpo> apiTestJpo = this.apiTestRepository.findById(name);
        if(!apiTestJpo.isPresent()) {
            return apiTestJpo.get().toDomain();
        } else {
            return null;
        }
    }

    @Override
    public ApiTest update(ApiTest apiTest) {
        ApiTestJpo apiTestJpo = new ApiTestJpo(apiTest);

        return this.apiTestRepository.save(apiTestJpo).toDomain();
    }

    @Override
    public void delete(String name) {

        this.apiTestRepository.deleteById(name);
    }

    @Override
    public List<ApiTest> findAll() {
        return ApiTestJpo.toDomains(this.apiTestRepository.findAll());
    }
}

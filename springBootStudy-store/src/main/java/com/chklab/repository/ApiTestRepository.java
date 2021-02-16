package com.chklab.repository;

import com.chklab.jpo.ApiTestJpo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ApiTestRepository extends JpaRepository<ApiTestJpo, String> {

    List<ApiTestJpo> findByStatus(Integer status);

}

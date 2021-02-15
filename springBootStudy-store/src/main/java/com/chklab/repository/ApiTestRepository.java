package com.chklab.repository;

import com.chklab.jpo.ApiTestJpo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApiTestRepository extends JpaRepository<ApiTestJpo, String> {

}

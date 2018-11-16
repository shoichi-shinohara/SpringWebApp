package com.tuyano.web;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDataEntityRepository extends JpaRepository<MyDataEntity, Integer> {

	List<MyDataEntity> findByName(String find);

}

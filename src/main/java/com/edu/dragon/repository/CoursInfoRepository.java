package com.edu.dragon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.edu.dragon.entity.CoursInfo;

public interface CoursInfoRepository extends JpaRepository<CoursInfo,Integer>,JpaSpecificationExecutor {
}


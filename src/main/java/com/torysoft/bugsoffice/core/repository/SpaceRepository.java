package com.torysoft.bugsoffice.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.torysoft.bugsoffice.core.domain.Space;

public interface SpaceRepository extends JpaRepository<Space, String>, QueryDslPredicateExecutor<Space>{

}

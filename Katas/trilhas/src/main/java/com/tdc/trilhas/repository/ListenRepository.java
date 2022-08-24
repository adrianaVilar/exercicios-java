package com.tdc.trilhas.repository;

import com.tdc.trilhas.model.Listen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenRepository extends JpaRepository<Listen, Long> {
}

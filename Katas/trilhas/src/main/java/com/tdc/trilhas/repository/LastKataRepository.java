package com.tdc.trilhas.repository;

import com.tdc.trilhas.model.LastKata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LastKataRepository extends JpaRepository<LastKata, Long> {
}

package com.tdc.trilhas.repository;

import com.tdc.trilhas.model.Hiring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiringRepository extends JpaRepository<Hiring, Long> {
}

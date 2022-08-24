package com.tdc.trilhas.repository;

import com.tdc.trilhas.model.Trails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailsRepository extends JpaRepository<Trails, Long> {
}

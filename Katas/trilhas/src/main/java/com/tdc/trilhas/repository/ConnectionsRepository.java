package com.tdc.trilhas.repository;

import com.tdc.trilhas.model.Connections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionsRepository extends JpaRepository<Connections, Long> {
}

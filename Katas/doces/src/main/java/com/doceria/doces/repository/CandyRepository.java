package com.doceria.doces.repository;

import com.doceria.doces.model.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandyRepository extends JpaRepository<Candy, Long> {
}

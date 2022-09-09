package com.coisasdamoto.queestragam.repository;

import com.coisasdamoto.queestragam.model.Estraga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstragaRepository extends JpaRepository<Estraga, Long> {
}

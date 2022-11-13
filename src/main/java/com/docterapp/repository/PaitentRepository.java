package com.docterapp.repository;

import com.docterapp.model.paitent.Paitent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaitentRepository extends JpaRepository<Paitent, Integer> {
}

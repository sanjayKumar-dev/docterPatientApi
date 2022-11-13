package com.docterapp.repository;

import com.docterapp.model.docter.Docter;
import com.docterapp.model.docter.DocterCity;
import com.docterapp.model.docter.DocterSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocterRepository extends JpaRepository<Docter, Integer> {
    List<Docter> findAllDocterByDocterCity(DocterCity docterCity);
}

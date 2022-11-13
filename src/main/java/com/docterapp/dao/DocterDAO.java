package com.docterapp.dao;

import com.docterapp.model.docter.Docter;

import java.util.List;

public interface DocterDAO {
    List<Docter> get();
    Docter get(int id);
    void save(Docter docter);
    void delete(int id);
}

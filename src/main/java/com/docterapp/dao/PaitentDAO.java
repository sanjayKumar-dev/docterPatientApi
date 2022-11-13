package com.docterapp.dao;

import com.docterapp.model.docter.Docter;
import com.docterapp.model.paitent.Paitent;

import java.util.List;

public interface PaitentDAO {
    List<Paitent> get();
    Paitent get(int id);
    void save(Paitent paitent);
    void delete(int id);
}

package com.docterapp.service;

import com.docterapp.model.docter.Docter;
import com.docterapp.repository.DocterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocterService {

    @Autowired
    private DocterRepository docterRepository;

    public void registerDocter(Docter docter){
        docterRepository.save(docter);
    }

    public List<Docter> getAllDocter(){
        return docterRepository.findAll();
    }

    public Docter getDocterById(int id){
        return docterRepository.findById(id).get();
    }

    public void deleteDocter(int id){
        docterRepository.deleteById(id);    }
}

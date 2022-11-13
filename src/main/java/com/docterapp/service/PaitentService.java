package com.docterapp.service;

import com.docterapp.model.paitent.Paitent;
import com.docterapp.repository.PaitentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaitentService {

    @Autowired
    private PaitentRepository paitentRepository;

    public void registerPaitent(Paitent paitent){
        paitentRepository.save(paitent);
    }

    public List<Paitent> getAllPaitent(){
        return paitentRepository.findAll();
    }

    public Paitent getPaitentById(int id){
        return paitentRepository.findById(id).get();
    }

    public void deletePaitent(int id){
        paitentRepository.deleteById(id);
    }
}

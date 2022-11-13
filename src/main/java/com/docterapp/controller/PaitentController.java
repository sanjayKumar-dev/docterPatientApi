package com.docterapp.controller;

import com.docterapp.model.paitent.Paitent;
import com.docterapp.service.PaitentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paitent")
public class PaitentController {
    @Autowired
    private PaitentService paitentService;

    @PostMapping("/register")
    public String registerPaitent(@RequestBody Paitent paitent){
        try {
            paitentService.registerPaitent(paitent);
            return "Registered Paitent Sucessfully";
        }
        catch (Exception e){
            return "Problem in registering Paitent";
        }
    }

    @GetMapping("/get")
    public List<Paitent> getAllPaitent(){
        return paitentService.getAllPaitent();
    }

    @GetMapping("/get/{id}")
    public Paitent getPaitentById(@PathVariable int id){
        return paitentService.getPaitentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePaitent(@PathVariable int id){
        try {
            paitentService.deletePaitent(id);
            return "Deleted Sucessfully";
        }
        catch (Exception e){
            return  "Problem in Deleting";
        }
    }
}

package com.docterapp.controller;

import com.docterapp.model.docter.Docter;
import com.docterapp.service.DocterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docter")
public class DocterController {

    Logger logger = LoggerFactory.getLogger(DocterController.class);
    @Autowired
    private DocterService docterService;

    @PostMapping("/register")
    public String registerDocter(@RequestBody Docter docter){
        try {
            docterService.registerDocter(docter);
            return "Registered Docter Sucessfully";
        }
        catch (Exception e){
            logger.error(e.toString());
            return "Problem in registering docter";

        }
    }

    @GetMapping("/get")
    public List<Docter> getAllDocter(){
        return docterService.getAllDocter();
    }

    @GetMapping("/get/{id}")
    public Docter getDocterById(@PathVariable int id){
        return docterService.getDocterById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDocter(@PathVariable int id){
        try {
            docterService.deleteDocter(id);
            return "Deleted Sucessfully";
        }
        catch (Exception e){
            return  "Problem in Deleting";
        }
    }
}

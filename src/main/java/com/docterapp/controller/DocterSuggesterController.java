package com.docterapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docterapp.service.DocterSuggesterService;

@RestController
@RequestMapping("/suggest")
public class DocterSuggesterController {

    @Autowired
    private DocterSuggesterService docterSuggesterService;

    @GetMapping("/docter/{pId}")
    public ResponseEntity<?> suggestDocter(@PathVariable int pId){
    	System.out.println("In Doc");
        return docterSuggesterService.suggestDocter(pId);
    }
}

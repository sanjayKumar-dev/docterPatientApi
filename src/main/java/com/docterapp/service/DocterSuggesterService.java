package com.docterapp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.docterapp.model.docter.Docter;
import com.docterapp.model.docter.DocterCity;
import com.docterapp.model.paitent.Paitent;
import com.docterapp.repository.DocterRepository;
import com.docterapp.repository.PaitentRepository;

@Service
public class DocterSuggesterService {
	Logger logger = LoggerFactory.getLogger(DocterSuggesterService.class);

    @Autowired
    private DocterRepository docterRepository;

    @Autowired
    private PaitentRepository paitentRepository;

    @Autowired
    private PaitentService paitentService;

    public ResponseEntity<?> suggestDocter(int pId){
        Paitent p = paitentService.getPaitentById(pId);
        String paitentSymtoms = p.getPaitentSymptom().toString();
        String docSpec;
        if(paitentSymtoms == "Arthritis" || paitentSymtoms == "Backpain" || paitentSymtoms == "Tissue_injuries")
            docSpec = "Orthopedic";
        else if (paitentSymtoms == "Dysmenorrhea")
            docSpec = "Gynecology";
        else if (paitentSymtoms == "Skin_infection" || paitentSymtoms == "skin_burn")
            docSpec = "Dermatology";
        else
            docSpec = "ENT";
        List<Docter> docterList = docterRepository.findAllDocterByDocterCity(DocterCity.valueOf(paitentRepository.findById(pId).get().getPaitentCity()));
        
        if(docterList.isEmpty()) {
        	return  ResponseEntity.ok("We are still waiting to expand to your location");
        }
        List<Docter> finalList = new ArrayList<Docter>();
        docterList.forEach(docter -> {
            if(docter.getDocterSpeciality().toString() == docSpec)
                finalList.add(docter);
        });
        System.out.println(finalList.isEmpty());
        if(finalList.isEmpty()) {
        	return  ResponseEntity.ok("There isn’t any doctor present at your location for your symptom");
        } else
        	return  ResponseEntity.ok(finalList);
    }
}

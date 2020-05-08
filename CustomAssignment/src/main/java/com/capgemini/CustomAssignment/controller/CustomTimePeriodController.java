package com.capgemini.CustomAssignment.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.CustomAssignment.model.CustomTimePeriod;
import com.capgemini.CustomAssignment.repository.TimePeriodRepository;


@CrossOrigin(origins="http://localhost:4200")  
@RestController
@RequestMapping("/api/v1")
public class CustomTimePeriodController {

 

    @Autowired
    private TimePeriodRepository timeRepository;

 

    @GetMapping("/retrieve")
    public List<CustomTimePeriod> getCustomTime() {
        System.out.println("fetching the data");
        return timeRepository.findAll();
        
    }

 

    @PostMapping("/time")
    public CustomTimePeriod createCustomTime(@RequestBody CustomTimePeriod time) {
        System.out.println("creating the data");

 

        return timeRepository.save(time);
    }

 

    @DeleteMapping("/time/{id}")
    public Map<String, Boolean> deleteById(@PathVariable(value = "id") Long customTimePeriodId) {
        Optional<CustomTimePeriod> content = timeRepository.findById(customTimePeriodId);
        System.out.println("deleting the data");
        if (content.isPresent()) {
        	timeRepository.deleteById(customTimePeriodId);
        }
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

 

    @PutMapping("/time/{id}")
    public ResponseEntity<CustomTimePeriod> updateContent(@PathVariable(value = "id") Long customTimePeriodId,
            @RequestBody CustomTimePeriod time) {
        System.out.println("editing the data");

 

        if (timeRepository.findById(customTimePeriodId).isPresent()) {
        	CustomTimePeriod existingTime = timeRepository.findById(customTimePeriodId).get();
        
        	existingTime.setParentPeriodId(time.getParentPeriodId());
        	existingTime.setPeriodTypeId(time.getPeriodTypeId());
        	existingTime.setPeriodNum(time.getPeriodNum());
        	existingTime.setPeriodName(time.getPeriodName());
        	existingTime.setFromDate(time.getFromDate());
        	existingTime.setThruDate(time.getThruDate());
        	existingTime.setClosed(time.isClosed());
            final CustomTimePeriod updatedTime = timeRepository.save(existingTime);
            return ResponseEntity.ok(updatedTime);
        }
        return null;
    }

 

        
}

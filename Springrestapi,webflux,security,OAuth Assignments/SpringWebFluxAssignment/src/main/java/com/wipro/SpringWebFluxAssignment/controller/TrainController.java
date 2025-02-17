package com.wipro.SpringWebFluxAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringWebFluxAssignment.entity.Train;
import com.wipro.SpringWebFluxAssignment.service.ITrainService;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/trains")
public class TrainController
{
	  @Autowired
	  ITrainService service;
	  
	  @GetMapping("/getall")
	    public Flux<Train> getAllDetailsOfTrain() {
	        return service.getAllTrains();
	    }

	    @GetMapping("/getbyid/{id}")
	    public Mono<Train> getTrainById(@PathVariable Long id) {
	        return service.getTrainById(id);
	    }

	    @PostMapping("/create")
	    public Mono<Train> createTrain(@RequestBody Train train) {
	        return  service.create(train);
	    }

	    @GetMapping("/name/{name}")
	    public Flux<Train> getTrainsByName(@PathVariable String name) {
	        return service.getTrainByName(name);
	    }
	    
	    @PutMapping("/update/{id}")
	    //@ResponseStatus(HttpStatus.UPGRADE_REQUIRED)
	    public Mono<Train> updateTrainById(@PathVariable long id,@RequestBody Train train)
	    {
	    	return service.updateTrain(id, train);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public Mono<Void> deleteUser(@PathVariable Long id) {
	        return service.deleteTrainById(id);
	    }
	

}

package com.wipro.SpringWebFluxAssignment.service;

import com.wipro.SpringWebFluxAssignment.entity.Train;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITrainService 
{
	public Mono<Train> create( Train train) ;
	
	  public Mono<Train> getTrainById( Long id) ;
	  public Mono<Train> updateTrain(Long id,Train train);
	
	public Flux<Train> getTrainByName(String name);
	
	public Flux<Train> getAllTrains();
	Mono<Void> deleteTrainById(Long id);

}

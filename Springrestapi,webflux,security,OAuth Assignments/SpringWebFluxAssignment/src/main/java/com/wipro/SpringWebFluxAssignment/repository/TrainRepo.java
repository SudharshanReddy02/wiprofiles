package com.wipro.SpringWebFluxAssignment.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.wipro.SpringWebFluxAssignment.entity.Train;


import reactor.core.publisher.Flux;

public interface TrainRepo extends ReactiveCrudRepository<Train,Long> {
	 
	public Flux<Train> findByName(String name);
}

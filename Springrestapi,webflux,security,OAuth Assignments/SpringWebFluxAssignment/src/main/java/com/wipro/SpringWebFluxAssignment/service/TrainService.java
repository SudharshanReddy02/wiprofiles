package com.wipro.SpringWebFluxAssignment.service;

import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.r2dbc.core.ExecuteFunction;
import org.springframework.stereotype.Service;

import com.wipro.SpringWebFluxAssignment.entity.Train;
import com.wipro.SpringWebFluxAssignment.repository.TrainRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TrainService  implements ITrainService{
   
	@Autowired
	TrainRepo repo;
	
	@Autowired
	DatabaseClient databaseclient;
	@Override
	public Mono<Train> create(Train train) {
		
		System.out.println(databaseclient);
		return this.databaseclient.sql("Insert into Train_table(id,name,email,tprice) values (:id,:name,:email,:tprice)")
				.filter((statement,ExecuteFunction)->statement.returnGeneratedValues("train").execute())
                .bind("id",train.getId())
                .bind("name",train.getName())
                .bind("email",train.getEmail())
                .bind("tprice",train.gettPrice())
                .fetch()
                .first()
                .map((r)->{return train;});
		
		
		//return repo.save(train);
	}

	@Override
	public Mono<Train> getTrainById(Long id) {
		
		return repo.findById(id);
	}

//	@Override
//	public Mono<Train> updateTrain(Long id, Train train) {
//
//		return repo.findById(id)
//				.flatMap(existingUser -> {
//					existingUser.setName(train.getName());
//					existingUser.setEmail(train.getEmail());
//					existingUser.settPrice(train.gettPrice());
//					return repo.save(existingUser);
//				});
//		
//		
//	}
	
	public Mono<Train> updateTrain(Long id, Train train) {
	    return this.databaseclient.sql("UPDATE Train_table SET name = :name, email = :email, tprice = :tprice WHERE id = :id")
	    		.bind("id", train.getId())
	            .bind("name", train.getName())
	            .bind("email", train.getEmail())
	            .bind("tprice", train.gettPrice())
	            .fetch()
	            .rowsUpdated()
	            .flatMap(rows -> rows > 0 ? Mono.just(train) : Mono.empty()); // Return train if updated, else empty
	}

	@Override
	public Flux<Train> getTrainByName(String name) {
	
		return repo.findByName(name);
	}

	@Override
	public Flux<Train> getAllTrains() {
		
		return repo.findAll();
	}

	@Override
	public Mono<Void> deleteTrainById(Long id) {
		
		return repo.deleteById(id);
	}

}

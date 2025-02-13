package com.wipro.CricketRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.Entity.Cricket;


@Repository
public interface cricRepo extends JpaRepository<Cricket,Long>
{

	//public Cricket findByTeam(String team1);
	
	public List<Cricket> findBySalaryGreaterThan(double salary);
	
    
    @Modifying
    @Query(value = "INSERT INTO Cricket (match_id, team1, team2, match_date, venue, salary) VALUES (:matchId, :team1, :team2, :matchDate, :venue, :salary)", nativeQuery = true)
    public int insertCricketRecord(long matchId, String team1, String team2, String matchDate, String venue, double salary);
}
	



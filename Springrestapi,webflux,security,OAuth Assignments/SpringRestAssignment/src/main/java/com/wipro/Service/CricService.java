package com.wipro.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wipro.CricketRepo.cricRepo;
import com.wipro.Entity.Cricket;


import lombok.extern.slf4j.Slf4j;
@Slf4j
@jakarta.transaction.Transactional
@Service
public class CricService implements ICricService {

	@Autowired
	
	cricRepo repo;

	@Override
	public Cricket insertData(Cricket cric) {
		// TODO Auto-generated method stub
		return repo.save(cric);
	}

	@Override
	public Cricket getMatchById(long matchId) {
	
		log.info("cricket data fetch from db to service");
		//return repo.findById(matchId).orElse(null);
		Optional<Cricket> match = repo.findById(matchId);
        return match.orElse(null);
        
	}

	@Override
	public List<Cricket> getAllMatches() {
		// TODO Auto-generated method stub
		//return repo.findAll();
		return repo.findAll(Sort.by("team2"));
	}

	@Override
	public List<Cricket> findBySalaryGreaterThan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}
	
public static boolean   validateInputData(Cricket cric) {
		
		boolean flag = false;
		
		if(cric.getMatchId() > 0 && cric.getTeam1().length() > 4 && cric.getSalary()> 5000) {
			
			flag = true;
			
			
		}
		
		return flag;
	}

	@Override
	public int insertCricketRecord(long matchId, String team1, String team2, String matchDate, String venue,
			double salary) {
		
		return repo.insertCricketRecord(matchId, team1, team2, matchDate, venue, salary);
	}

	



}
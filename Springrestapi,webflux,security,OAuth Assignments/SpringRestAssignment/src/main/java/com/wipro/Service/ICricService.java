package com.wipro.Service;

import java.util.List;

import com.wipro.Entity.Cricket;


public interface ICricService 
{
	
    public Cricket insertData(Cricket cric);
    public  Cricket  getMatchById(long matchId);
    public List<Cricket> getAllMatches(); 
    
	

    public List<Cricket> findBySalaryGreaterThan(double salary);
    
    public int insertCricketRecord(long matchId, String team1, String team2, String matchDate, String venue, double salary);
    
    
    
    
    
}

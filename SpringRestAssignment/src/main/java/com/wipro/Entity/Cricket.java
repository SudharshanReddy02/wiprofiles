package com.wipro.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cricket
{
	    @Id
	    private long matchId;
	    private String team1;
	    private String team2;
	    private String matchDate;
	    private String venue;
	    private double salary;

	   
	    public Cricket() {
	    }

	 
	    public Cricket(String team1, String team2, String matchDate, String venue,double salary) {
	        this.team1 = team1;
	        this.team2 = team2;
	        this.matchDate = matchDate;
	        this.venue = venue;
	        this.salary=salary;
	    }

	    
	    public long getMatchId() {
	        return matchId;
	    }

	    public void setMatchId(int matchId) {
	        this.matchId = matchId;
	    }

	    public String getTeam1() {
	        return team1;
	    }

	    public void setTeam1(String team1) {
	        this.team1 = team1;
	    }

	    public String getTeam2() {
	        return team2;
	    }

	    public void setTeam2(String team2) {
	        this.team2 = team2;
	    }

	    public String getMatchDate() {
	        return matchDate;
	    }

	    public void setMatchDate(String matchDate) {
	        this.matchDate = matchDate;
	    }

	    public String getVenue() {
	        return venue;
	    }

	    public void setVenue(String venue) {
	        this.venue = venue;
	    }


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Cricket [matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", matchDate=" + matchDate
					+ ", venue=" + venue + ", salary=" + salary + "]";
		}


		
	    
	}




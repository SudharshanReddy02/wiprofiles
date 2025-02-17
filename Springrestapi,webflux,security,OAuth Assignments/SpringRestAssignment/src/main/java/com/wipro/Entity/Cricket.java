package com.wipro.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Setter
@Getter

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cricket
{
	   
		@Id
		@Min(value=0)
		@Max(value=500)
	    private long matchId;
		@NotNull
		@NotBlank
	    private String team1;
	    private String team2;
	    private String matchDate;
	    private String venue;
	    @DecimalMin(value="1000.0")
	    @DecimalMax(value="100000.0")
	    private double salary;
	    @Email
	    private String email;
	    @Pattern(regexp="[A-Z][a-z0-9]{4}")
	    private String password;

	   
	   

	 
//	    public Cricket(String team1, String team2, String matchDate, String venue,double salary) {
//	        this.team1 = team1;
//	        this.team2 = team2;
//	        this.matchDate = matchDate;
//	        this.venue = venue;
//	        this.salary=salary;
//	    }

	    
//	    public Cricket(String team1, String team2, String matchDate, String venue,double salary) {
//			
//		}


//		public long getMatchId() {
//	        return matchId;
//	    }
//
//	    public void setMatchId(int matchId) {
//	        this.matchId = matchId;
//	    }
//
//	    public String getTeam1() {
//	        return team1;
//	    }
//
//	    public void setTeam1(String team1) {
//	        this.team1 = team1;
//	    }
//
//	    public String getTeam2() {
//	        return team2;
//	    }
//
//	    public void setTeam2(String team2) {
//	        this.team2 = team2;
//	    }
//
//	    public String getMatchDate() {
//	        return matchDate;
//	    }
//
//	    public void setMatchDate(String matchDate) {
//	        this.matchDate = matchDate;
//	    }
//
//	    public String getVenue() {
//	        return venue;
//	    }
//
//	    public void setVenue(String venue) {
//	        this.venue = venue;
//	    }
//
//
//		public double getSalary() {
//			return salary;
//		}
//
//
//		public void setSalary(double salary) {
//			this.salary = salary;
//		}
//
//
//		@Override
//		public String toString() {
//			return "Cricket [matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", matchDate=" + matchDate
//					+ ", venue=" + venue + ", salary=" + salary + "]";
//		}
//

		
	    
	}




package com.wipro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Entity.Cricket;
import com.wipro.Service.ICricService;



@RestController
@RequestMapping("/api/cricket")
public class cricController {
    @Autowired   
	ICricService service;
    
    @PostMapping("/insert")
    public Cricket insert(@RequestBody Cricket cric)
    {
    	return service.insertData(cric);
    }
    
    @GetMapping("/getMatchId/{matchId}")
    public Cricket getMatchById(@PathVariable long matchId)
    {
    	return service.getMatchById(matchId);
    }
    @GetMapping("/getall")
	public List<Cricket> getAllMatches() {

		return service.getAllMatches();
	}
    
    @GetMapping("/get/gt-salary/{sal}")
	public List<Cricket> getSalaryGT(@PathVariable  double sal) {

		return service.findBySalaryGreaterThan(sal);
	}
    @PostMapping("/insertquery")
    public ResponseEntity<String> insertCricket(@RequestBody Cricket cricket) {
        service.insertCricketRecord(
            cricket.getMatchId(),
            cricket.getTeam1(),
            cricket.getTeam2(),
            cricket.getMatchDate(),
            cricket.getVenue(),
            cricket.getSalary()
        );
        return ResponseEntity.ok("Cricket match inserted successfully!");
    }
    
    

}

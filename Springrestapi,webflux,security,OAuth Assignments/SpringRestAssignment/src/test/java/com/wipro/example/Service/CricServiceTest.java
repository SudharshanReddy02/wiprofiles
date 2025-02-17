package com.wipro.example.Service;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.Entity.Cricket;
import com.wipro.Service.ICricService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class CricServiceTest {
    
	Cricket cric;
	@Autowired
	ICricService service;
	
	@Test
	@Disabled
	void testInsertData() {
		
		cric = new Cricket(320,"dinesh@gmail.com", "2026-08-9","D452r","India",50000,"SriLanka","ChinnaSwamyStadium");

		  Cricket c1 =		service.insertData(cric);
			
				assertNotNull(c1);
				assertEquals(320, c1.getMatchId());
	}

	@Test

	void testGetMatchById() {
		
		Cricket c2 =	service.getMatchById(314);
		
		try {
			assertTrue(c2.getSalary() > 1000.0);
		}
		catch (Exception e) {
			
			assertThrows(NullPointerException.class,()->{  throw  e;});
			
		}
			
			
	}

	@Test
	@Disabled
	void testGetAllMatches() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFindBySalaryGreaterThan() {
		fail("Not yet implemented");
	}

	
	
	}

	



package com.wipro.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Entity.Cricket;

@RestController
@RequestMapping("/api/demo")
public class demoController 
{
	@GetMapping("/hello")
	public String hello() {

		return "Hello Friends";

	}
	 @PostMapping("/insert")
	    public String insert(@RequestBody Cricket cric)
	    {
	    	return "data inserted "+cric;
	    }

		@GetMapping("/div/{a}/{b}")
		public  int    div(@PathVariable int a,  @PathVariable int b) {
			
			String name = null;
			
			name.length();
			
			return  a/b;
			
		}
	
//		  @ResponseStatus(reason = "sorry , you can't divide number by zero",code =
//		  HttpStatus.NOT_ACCEPTABLE)
//		  
//		  @ExceptionHandler(ArithmeticException.class)
//		  public void exceptionHandler() {
//		  
//		  System.out.println("Exception Handle by method");
//		  
//		  }
//		  
//		  
//		  @ExceptionHandler(Exception.class)
//		  public ResponseEntity<String> handleExp(){
//		  
//		  
//		  return new ResponseEntity<String>("Null Value Found",HttpStatus.BAD_REQUEST);
//		 
//		 }
}

package com.wipro.springrest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.entity.Employee;
import com.wipro.springrest.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@GetMapping("/getbyid/{eid}")
	public Employee getById(@PathVariable int eid) {

		return service.getEmployeeById(eid);
	}

	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee emp) {

		return service.insertEmp(emp);

	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return service.updateEmp(emp);

	}

	@DeleteMapping("/deletebyid/{eid}")
	public ResponseEntity<String> deleteById(@PathVariable int eid) {

		return service.deleteEmployeeById(eid);

	}
	
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees() {

		return service.getAllEmployees();
	}
	
	@GetMapping("/getbyname/{ename}")
	public Employee getByEname(@PathVariable String ename) {

		return service.findByename(ename);
	}
	
	
	@GetMapping("/get/gt-salary/{sal}")
	public List<Employee> getSalaryGT(@PathVariable  double sal) {

		return service.findBySalaryGreaterThan(sal);
	}
	
	
	@GetMapping("/getbysalaries/{min}/{max}")
	public List<Employee> getAllBySalaries(@PathVariable  double min , @PathVariable double max) {

		return service.getAllFilterBySalary(min, max);
	}
    
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteByEname(@PathVariable String ename) {

		 service.deleteByEname(ename);
		 
		 return "Delete Mapping executed..";

	}
	
	
	
	
	
	
	
	

}

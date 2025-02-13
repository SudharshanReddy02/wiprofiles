package com.wipro.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.springrest.entity.Employee;
import com.wipro.springrest.repositoy.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {

	
		@Autowired
		EmployeeRepository repo;
	
	
	@Override
	public Employee insertEmp(Employee emp) {
		
		return   repo.save(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return   repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		
		return  repo.findById(eid).orElse(null);
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(int eid) {


		repo.deleteById(eid);
		
		return   new ResponseEntity<String>("Record Deleted Successfully",HttpStatus.OK);
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		//return  repo.findAll();
		return repo.findAll(Sort.by("ename"));
	}

	@Override
	public Employee findByename(String ename) {
		// TODO Auto-generated method stub
		return repo.findByename(ename);
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(double salary) {


		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAllFilterBySalary(double min, double max) {
	
		return repo.getAllFilterBySalary(min, max);
	}

	@Override
	public void deleteByEname(String ename) {
		
		 repo.deleteByEname(ename);
	}


}

package com.emp.index.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.index.entities.Employee;
import com.emp.index.repositories.EmpRepository;



@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepo;
	
	@Override
	public double indexCalculate(Employee emp, int Q1, int Q2, int Q3, int Q4, int Q5) {
	
		
		double Q =(Q1 + Q2 + Q3 + Q4 + Q5);
		
		emp.setSatisfyPercentage(Q);
		
		empRepo.save(emp);
		
		return emp.getSatisfyPercentage();
	}
}

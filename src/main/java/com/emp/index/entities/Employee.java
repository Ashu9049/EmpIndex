package com.emp.index.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name", nullable=false, length=45)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=45)
	private String lastName;
	
	@Column(name="sat_per")
	private double satisfyPercentage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSatisfyPercentage() {
		return satisfyPercentage;
	}

	public void setSatisfyPercentage(double satisfyPercentage) {
		this.satisfyPercentage = satisfyPercentage;
	}
}

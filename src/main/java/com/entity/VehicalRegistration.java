package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vehical_Registration")
public class VehicalRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="type")
	private String type;
	
	@Column(name="model")
	private String model;
	
	@Column(name="Color")
	private String color;
	
	@Column(name="no_of_passengers")
	private Integer noOfPassengers;
	
	@Column(name="Date_of_purchase")
	private LocalDate dateOfPurchase;
	
	@Column(name="Registration_no", length = 10)
	private String registrationNumber;
	
	public VehicalRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}


	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}


	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}


	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public VehicalRegistration(Integer id, String type, String model, String color, Integer noOfPassengers,
			LocalDate dateOfPurchase, String registrationNumber) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.color = color;
		this.noOfPassengers = noOfPassengers;
		this.dateOfPurchase = dateOfPurchase;
		this.registrationNumber = registrationNumber;
	}


	@Override
	public String toString() {
		return "VehicalRegistration [id=" + id + ", type=" + type + ", model=" + model + ", color=" + color
				+ ", noOfPassengers=" + noOfPassengers + ", dateOfPurchase=" + dateOfPurchase + ", registrationNumber="
				+ registrationNumber + "]";
	}
	
	
	
}

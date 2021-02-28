package com.mrBeanCars.webapp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
public class Cars {
	@Id
	private Long id;
	private String company;
	private String model;
	private String colour;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfPurchase;
	private Long price;
	private Long engineCapacity;
	private String licencePlateNumber;
	private Long seatingCapacity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Long engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getLicencePlateNumber() {
		return licencePlateNumber;
	}

	public void setLicencePlateNumber(String licencePlateNumber) {
		this.licencePlateNumber = licencePlateNumber;
	}

	public Long getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Long seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

}

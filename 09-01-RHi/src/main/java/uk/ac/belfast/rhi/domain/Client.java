package uk.ac.belfast.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private Integer clientId;
	private String name;
	private String postcode;
	private String date ;
	private String Business;
	private String TechnologyType;
	private Float Capacity;
	private Double Payment;
	
	public Client() {
		
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBusiness() {
		return Business;
	}

	public void setBusiness(String business) {
		Business = business;
	}

	public String getTechnologyType() {
		return TechnologyType;
	}

	public void setTechnologyType(String technologyType) {
		TechnologyType = technologyType;
	}

	public Float getCapacity() {
		return Capacity;
	}

	public void setCapacity(Float capacity) {
		Capacity = capacity;
	}

	public Double getPayment() {
		return Payment;
	}

	public void setPayment(Double payment) {
		Payment = payment;
	}

}
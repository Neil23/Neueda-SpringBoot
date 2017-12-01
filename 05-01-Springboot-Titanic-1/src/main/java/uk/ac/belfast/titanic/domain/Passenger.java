package uk.ac.belfast.titanic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger
{

	public Passenger(Integer passengerId) {
	
	
		
	}

	@Id
	@GeneratedValue
               
	private Integer passengerId;
    private Integer survived;
    private Integer pclass;
    private String name;
    private String sex;
    private Float age;
    private Integer sibsp;
    private Integer parch;
    private String ticket;
    private Float fare;
    private String cabin;
    private String embarked;

	
	
	
                public Passenger(Integer passengerId, Integer survived, Integer pclass, String name, String sex, Float age,
			Integer sibsp, Integer parch, String ticket, Float fare, String cabin, String embarked) {
		super();
		this.passengerId = passengerId;
		this.survived = survived;
		this.pclass = pclass;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sibsp = sibsp;
		this.parch = parch;
		this.ticket = ticket;
		this.fare = fare;
		this.cabin = cabin;
		this.embarked = embarked;
	}




				public Integer getPassengerId() {
		return passengerId;
	}




	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}




	public int getSurvived() {
		return survived;
	}




	public void setSurvived(int survived) {
		this.survived = survived;
	}




	public int getPclass() {
		return pclass;
	}




	public void setPclass(int pclass) {
		this.pclass = pclass;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public float getAge() {
		return age;
	}




	public void setAge(float age) {
		this.age = age;
	}




	public int getSibsp() {
		return sibsp;
	}




	public void setSibsp(int sibsp) {
		this.sibsp = sibsp;
	}




	public int getParch() {
		return parch;
	}




	public void setParch(int parch) {
		this.parch = parch;
	}




	



	public String getTicket() {
		return ticket;
	}




	public void setTicket(String ticket) {
		this.ticket = ticket;
	}




	public double getFare() {
		return fare;
	}




	public void setFare(float fare) {
		this.fare = fare;
	}




	public String getCabin() {
		return cabin;
	}




	public void setCabin(String cabin) {
		this.cabin = cabin;
	}




	public String getEmbarked() {
		return embarked;
	}




	public void setEmbarked(String embarked) {
		this.embarked = embarked;
	}

}


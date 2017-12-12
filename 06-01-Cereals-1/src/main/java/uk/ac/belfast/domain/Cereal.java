package uk.ac.belfast.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {

	@Id
	@GeneratedValue
	
	private Integer cerealId;
	private String Manufacturer;
	private  String  Cereal;
	private  int  calories;
	private int  energy;
	private float protien;
	private float carbohydrate;
	private float fat;
	private float  saturates;
	private float fibre;
	private float salt;
	private float sodium;
	private float iron;
	public Integer getCerealId() {
		return cerealId;
	}
	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getCereal() {
		return Cereal;
	}
	public void setCereal(String cereal) {
		Cereal = cereal;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public float getProtien() {
		return protien;
	}
	public void setProtien(float protien) {
		this.protien = protien;
	}
	public float getCarbohydrate() {
		return carbohydrate;
	}
	public void setCarbohydrate(float carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public float getFat() {
		return fat;
	}
	public void setFat(float fat) {
		this.fat = fat;
	}
	public float getSaturates() {
		return saturates;
	}
	public void setSaturates(float saturates) {
		this.saturates = saturates;
	}
	public float getFibre() {
		return fibre;
	}
	public void setFibre(float fibre) {
		this.fibre = fibre;
	}
	public float getSalt() {
		return salt;
	}
	public void setSalt(float salt) {
		this.salt = salt;
	}
	public float getSodium() {
		return sodium;
	}
	public void setSodium(float sodium) {
		this.sodium = sodium;
	}
	public float getIron() {
		return iron;
	}
	public void setIron(float iron) {
		this.iron = iron;
	}
	public Cereal(Integer cerealId, String manufacturer, String cereal, int calories, int energy, float protien,
			float carbohydrate, float fat, float saturates, float fibre, float salt, float sodium, float iron) {
		super();
		this.cerealId = cerealId;
		Manufacturer = manufacturer;
		Cereal = cereal;
		this.calories = calories;
		this.energy = energy;
		this.protien = protien;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.salt = salt;
		this.sodium = sodium;
		this.iron = iron;
	}
	
}

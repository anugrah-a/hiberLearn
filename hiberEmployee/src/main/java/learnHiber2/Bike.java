package learnHiber2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bike {
	@Id
	int modelNum;
	String brand;
	int price;
	@ManyToOne
	PersonBike person;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int modelNum, String brand, int price, PersonBike p) {
		super();
		this.modelNum = modelNum;
		this.brand = brand;
		this.price = price;
		this.person = p;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public PersonBike getPerson() {
		return person;
	}
	public void setPerson(PersonBike person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Bike [modelNum=" + modelNum + ", brand=" + brand + ", price=" + price + ", person=" + person + "]";
	}
	
	
	
}

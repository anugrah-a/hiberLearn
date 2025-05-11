package learnHiber2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class PersonBike {
	@Id
	int Id;
	String name;

	@OneToMany
	List<Bike> bikeList;
	public PersonBike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonBike(int id, String name, List<Bike> bikeList) {
		super();
		Id = id;
		this.name = name;
		this.bikeList = bikeList;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Bike> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}
	@Override
	public String toString() {
		return "PersonBike [Id=" + Id + ", name=" + name + ", bikeList=" + bikeList + "]";
	}
	
}

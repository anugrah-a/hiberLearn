package learn.hiberEmployee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AdhaarCard {
	@Id
	int aadhNum;
	String name;
	String address;
	String gender;
	@OneToOne
	Person person;
	public AdhaarCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdhaarCard(int aadhNum, String name, String address, String gender, Person person) {
		super();
		this.aadhNum = aadhNum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.person = person;
	}
	public int getAadhNum() {
		return aadhNum;
	}
	public void setAadhNum(int aadhNum) {
		this.aadhNum = aadhNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AdhaarCard [aadhNum=" + aadhNum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", person=" + person + "]";
	}
	
	
}

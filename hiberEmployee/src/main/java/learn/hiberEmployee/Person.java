package learn.hiberEmployee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	String nickName;
	@OneToOne
	AdhaarCard card;

	public Person(int id, String nickName, AdhaarCard card) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.card = card;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public AdhaarCard getCard() {
		return card;
	}

	public void setCard(AdhaarCard ad) {
		this.card = ad;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nickName=" + nickName + ", card=" + card + "]";
	}
	
	
}

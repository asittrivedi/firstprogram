package hibernate9.hibernate9;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@AttributeOverrides({@AttributeOverride(name="id",column=@Column(name="empid")),@AttributeOverride(name="id",column=@Column(name="empid"))})
public class address1 extends employee1 {
	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public address1(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	public address1(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "address1 [city=" + city + ", state=" + state + "]";
	}
	

}

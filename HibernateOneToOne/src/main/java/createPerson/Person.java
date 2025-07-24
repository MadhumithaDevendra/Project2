package createPerson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int pid;
	private String name;
	@OneToOne
	private BloodGroup bg;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BloodGroup getBg() {
		return bg;
	}
	public void setBg(BloodGroup bg) {
		this.bg = bg;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String name, BloodGroup bg) {
		super();
		this.pid = pid;
		this.name = name;
		this.bg = bg;
	}
	
}

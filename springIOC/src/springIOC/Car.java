package springIOC;

public class Car {
	int idno;
	String cost;
	String brand;
	
	Engine eng;

	public int getIdno() {
		return idno;
	}

	public void setIdno(int idno) {
		this.idno = idno;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int idno, String cost, String brand, Engine eng) {
		super();
		this.idno = idno;
		this.cost = cost;
		this.brand = brand;
		this.eng = eng;
	}
	
	

}

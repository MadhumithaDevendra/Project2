package springIOC;

public class Engine {
	String make;
	String capacity;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String make, String capacity) {
		super();
		this.make = make;
		this.capacity = capacity;
	}
	
	

}

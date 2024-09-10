package application;


public class Car {

	private int carregno;
	private String make;
	private String model;
	private String available;
	
	public Car(int string, String i, String j, String k) {
		this.carregno = string;
		this.make = i;
		this.model = j;
		this.available = k;
	}


	public int getCarregno() {
		return carregno;
	}
	
	public void setCarregno(int carregno) {
		this.carregno = carregno;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
		
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getAvailable() {
		return available;
	}
	
	public void setAvailable(String available) {
		this.available = available;
	}
}

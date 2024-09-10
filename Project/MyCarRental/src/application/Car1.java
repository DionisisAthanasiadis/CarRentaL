package application;

public class Car1 {
	
	private int customerid;
	private String customername;
	private String address;
	private String mobile;
	
	public Car1(int string, String i, String j, String k) {
		this.customerid = string;
		this.customername = i;
		this.address = j;
		this.mobile = k;
	}


	public int getCustomerid() {
		return customerid;
	}
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public String getCustomername() {
		return customername;
	}
	
	public void setCustomername(String customername) {
		this.customername = customername;
	}
		
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

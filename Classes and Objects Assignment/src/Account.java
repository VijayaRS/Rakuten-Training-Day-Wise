enum TYPE{
	SB,FD;
}


public class Account {
	
private  static int counter=10000;
private int accNo;
private String accOpeningDate;
private TYPE type;
private double balance;
private Customer customer;


//getters and setters
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	accNo = accNo;
}
public String getAccOpeningDate() {
	return accOpeningDate;
}
public void setAccOpeningDate(String accOpeningDate) {
	accOpeningDate = accOpeningDate;
}
public TYPE getType() {
	return type;
}
public void setType(TYPE type) {
	this.type = type;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}

//method to generate acc no
private int generateAccNo() {
	
	return counter++;
}

//constructor
public Account(int accNo, String accOpeningDate, TYPE type, double balance, Customer customer) {
	super();
	this.accNo = accNo;
	this.accOpeningDate = accOpeningDate;
	this.type = type;
	this.balance = balance;
	this.customer = customer;
}


//Display Account info.
@Override
public String toString() {
	String accInfo=String.format("Account Number: %d\nCustomer ID: %d\nAccount Type: %s\nAccount Opening date: %s\nAccount Balance: %f\n");
	return accInfo;
}

public static void main(String[] args) {
	
}











}

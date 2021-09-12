package lab;
import java.util.*;

public class Account {
	
	//initializing Variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	//Constructor based
	Account(int id, double balance, double annualInterestRate){
		
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
	}
	
	//No Constructor or Default
	Account(){
		
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		
	}
	
	//The Get Methods
	public int getId(){
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//The Set Methods
	public void setId(int newId){
		id = newId;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newRate){
		annualInterestRate = newRate;
	}
	
	//Accessor Method for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//Returns Monthly Interest Rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	//Returns Monthly Interest
	public double getMonthlyInterest() {
		return (balance / 100) * getMonthlyInterestRate();
	}
	
	//Withdraws money from the account
	public void withdraw(double amount){
		balance -= amount;
	}
	
	//Deposits money into the account
	public void deposit(double amount){
		balance += amount;
	}
}

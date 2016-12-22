package com.t1;

abstract class Test {
	public void deposit(double amount){
		System.out.println("Depositing: "+amount);
	}
	public void withdraw(double amount){
		System.out.println("Withdraw: "+amount);
	}
	public abstract double calculateInerest(double amount);
}
class SavingAccount extends Test{
	public double calculateInerest(double amount) {
		return amount*0.03;
	}
	public void deposit(double amount) {
		super.deposit(amount);
	}
	public void withdraw(double amount) {
		super.withdraw(amount);
	}
}
class TermDepositAccount extends Test{
	public double calculateInerest(double amount) {
		return amount*0.05;
	}

	public void deposit(double amount) {
		
		super.deposit(amount);
	}

	public void withdraw(double amount) {
		
		super.withdraw(amount);
	}
}
public class Account{
	public static void main(String[] args) {
		Test acc1 = new SavingAccount();
		acc1.deposit(50.0);
		Test acc2 = new TermDepositAccount();
		acc2.deposit(25.0);
		acc1.withdraw(25.0);
		acc2.withdraw(10.0);
		double cal1 = acc1.calculateInerest(100.0);
		double cal2 = acc2.calculateInerest(100.0);
		
		System.out.println("Savings-> "+cal1);
		System.out.println("TermDeposit-> "+cal2);
	}
}
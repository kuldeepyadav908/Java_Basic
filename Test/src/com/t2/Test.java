package com.t2;

public class Test {

	public static void main(String[] args) {
		Account acc1 = new SavingAccountImpl();
		acc1.deposit(50.0);
		Account acc2 = new TermDepositAccountImpl();
		acc2.deposit(25.0);
		acc1.withDraw(20.0);
		acc2.withDraw(10);
		double cal1 = acc1.calculateInterest(100);
		double cal2 = acc2.calculateInterest(100.0);
		System.out.println("Savings-> "+cal1);
		System.out.println("TermDeposit-> "+cal2);
	}

}
interface Account{
	public abstract double calculateInterest(double amount);
	public abstract void deposit(double amount);
	public abstract void withDraw(double amount);
}
interface AccountHelper{
	public abstract void deposit(double amount);
	public abstract void withDraw(double amount);
}
class AccountHelperImpl implements AccountHelper{
	public void deposit(double amount) {
		System.out.println("Deposit-> "+amount);
		
	}
	
	public void withDraw(double amount) {
		System.out.println("WithDraw-> "+amount);
		
	}
}
class SavingAccountImpl implements Account{
	AccountHelper helper = new AccountHelperImpl();
	public double calculateInterest(double amount) {
		
		return amount*0.03;
	}
	
	public void deposit(double amount) {
		helper.deposit(amount);
		
	}
	
	public void withDraw(double amount) {
		helper.withDraw(amount);
		
	}
}
class TermDepositAccountImpl implements Account{
	AccountHelper helper  = new AccountHelperImpl();
	
	public double calculateInterest(double amount) {
		
		return amount*0.05;
	}
	
	public void deposit(double amount) {
		helper.deposit(amount);
		
	}
	
	public void withDraw(double amount) {
		helper.withDraw(amount);
		
	}
}
package co.edureka;

public class Bank {

	public void deposit() {
		System.out.println("A generic deposit method");
	}
	
	public void deposit(String acno, double amt) {
		System.out.println("Deposit amount of Rs: "+amt+" in A/C "+acno);
	}
}

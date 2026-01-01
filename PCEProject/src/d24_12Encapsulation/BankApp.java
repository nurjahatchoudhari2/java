package d24_12Encapsulation;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter amount to deposit");
		Bank b = new Bank();
		int bal = scan.nextInt();
		b.setBalance(bal);
		System.out.println("Your current balance : "+ b.getBalance());
		
		System.out.println("Enter amount to windraw ");
		int w = scan.nextInt();
		
		int update_bal = b.getBalance()-w;
		b.setBalance(update_bal);
		System.out.println("Yout current balance : "+ b.getBalance());
		

	}

}
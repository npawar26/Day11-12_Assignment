package com.bridgelabz.Oops;

import java.util.*;
class Account{

	void Debit(){
		long BALANCE = 100000;

		System.out.println(" Enter amount to debit : ");
		Scanner sc = new Scanner(System.in);
		int AMOUNT = sc.nextInt();
		sc.close();
		long REMAINS = BALANCE-AMOUNT;

		if( AMOUNT <= BALANCE) {
			System.out.println("Your Money " + AMOUNT + " is Debited from Account xxxxxx400 ");
			System.out.println(" Your BALANCE is "+REMAINS);
		}else{
			System.out.println(" Debit amount exceeded account balance ");
		}
	}

}

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.Debit();
	}
}

package com.app;

import java.util.Scanner;

public class Atm {
	
	private int pin=2344;
	private float balance;
	
	public void checkPin()
	{	
		System.out.println("Enter a four digit pin");
		
		Scanner sc=new Scanner(System.in);
		int enteredpin=sc.nextInt();
		
		if(pin==enteredpin)
		{
			menu();
		}else
		{
			System.out.println("enter valid pin !");
			checkPin();
		}
		
	}
	
	public void menu()
	{
		System.out.println("1.Check a/c Balance ");
		System.out.println("2.Withdraw ");
		System.out.println("3.Deposit ");
		System.out.println("4.Exit ");
		do {
			
			boolean flag=true;
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:
			
			System.out.println("Balance "+balance);
			break;
			
		case 2:
			System.out.println("Enter amount to withdraw ");
			float amt=sc.nextFloat();
			if(amt>balance)
			{
				System.out.println("Insufficient balance ");
			}else
			{
				balance=balance-amt;
				System.out.println("Withdrawed successfully ");
				System.out.println("remaining amount "+balance);
			}
			 break;
		case 3:
			System.out.println("enter amount to deposit ");
			float deposit=sc.nextFloat();
			balance+=deposit;
			System.out.println("Rs. "+deposit+" Deposited Successfully ");
			System.out.println("Current Balance is "+balance);
			break;
			
		case 4:
			  flag=false;
		      return;
		      
		default:
			  System.out.println("Enter valid choice ");
			  break;
		
			
		}
		
		}while(true);
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Welcome to ATM.. ");
		
		Atm obj=new Atm();
		
		obj.checkPin();
		

	}

}

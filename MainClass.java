package bank;

import java.util.Scanner; 
import java.util.InputMismatchException;

public class MainClass {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in); 
	        System.out.println("Enter account number: "); 
	        int accountno = sc.nextInt(); 
	        sc.nextLine(); 
	        System.out.println("Enter the account holders name:"); 
	        String name = sc.nextLine(); 
	        System.out.print("Enter initial balance: "); 
	        double balance = 0; 
	        try { 
	            balance = sc.nextDouble(); 
	        } catch (InputMismatchException e) { 
	            System.out.println("Invalid input for balance. Starting with 0 balance."); 
	            sc.nextLine();  
	        } 
	 
	        Account acc = new Account(accountno, name, balance); 
	 
	  
	        while (true) { 
	            System.out.println("Bank Menu"); 
	            System.out.println("1. Deposit"); 
	            System.out.println("2. Withdraw"); 
	            System.out.println("3. Show Balance"); 
	            System.out.println("4. Exit"); 
	            System.out.print("Choose an option: "); 
	            int choice = 0; 
	            try { 
	                choice = sc.nextInt(); 
	                if (choice == 4) { 
	                    System.out.println("Thank you for using our bank."); 
	                    break; 
	                } 
	                switch (choice) { 
	                    case 1: 
	                        System.out.print("Enter deposit amount: "); 
	                        double depositAmount = sc.nextDouble(); 
	                        acc.deposit(depositAmount); 
	                        break; 
	                    case 2: 
	                        System.out.print("Enter withdrawal amount: "); 
	                        double withdrawAmount = sc.nextDouble(); 
	                        try { 
	                            acc.withdraw(withdrawAmount); 
	                        } catch (InsufficientBalanceException e) { 
	                            System.out.println("Error: " + e.getMessage()); 
	                        } catch (ArithmeticException e) { 
	                            System.out.println("Error: " + e.getMessage()); 
	 
	
	                        } 
	                        break; 
	                    case 3: 
	                        acc.showBalance(); 
	                        break; 
	                    default: 
	                        System.out.println("Invalid choice, try again."); 
	                } 
	            } catch (InputMismatchException e) { 
	                System.out.println("Invalid input, please enter numbers only."); 
	                sc.nextLine();  
	            } 
	        } 
	        sc.close(); 
	    } 
	

		
	}



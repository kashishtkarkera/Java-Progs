package bank;

public class Account {
	  int accountno; 
	    String name; 
	    double balance; 
	 
	    Account(int accountno, String name, double balance) { 
	        this.accountno = accountno; 
	        this.name = name; 
	        this.balance = balance; 
	    } 
	 
	    void deposit(double amount) { 
	        balance = balance + amount; 
	        System.out.println("deposited amount: " + amount); 
	    } 
	 
	    void withdraw(double amount) throws InsufficientBalanceException { 
	        if (amount < 0) { 
	            throw new ArithmeticException("amount cannot be negative"); 
	        } 
	        if (amount > balance) { 
	            throw new InsufficientBalanceException("Not enough balance"); 
	        } 
	        balance = balance - amount; 
	 
	
	  
	        System.out.println("withdrawn amount: " + amount); 
	    } 
	 
	    void showBalance() { 
	        System.out.println("current balance in bank: " + balance); 
	    } 
	}

	


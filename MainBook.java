package library;

import java.util.Scanner;

public class MainBook {

	public static void main(String[] args) {
		
		        BookStack bookStack = new BookStack(5); 
		 
		       
		        Scanner scanner = new Scanner(System.in); 
		        int choice; 
		 do { 
		            System.out.println("\nLibrary Stack Menu:"); 
		            System.out.println("1. Push a single book ID"); 
		            System.out.println("2. Push two book IDs"); 
		            System.out.println("3. Pop a single book ID"); 
		            System.out.println("4. Pop multiple book IDs"); 
		            System.out.println("5. Display entire stack"); 
		            System.out.println("6. Display top n books"); 
		            System.out.println("7. Exit"); 
		 
		
		            System.out.print("Enter your choice: "); 
		            choice = scanner.nextInt(); 
		 
		            switch (choice) { 
		                case 1: 
		                    System.out.print("Enter a book ID to push: "); 
		                    int bookID = scanner.nextInt(); 
		                    bookStack.push(bookID); 
		                    break; 
		 
		                case 2: 
		                    System.out.print("Enter two book IDs to push : "); 
		                    int bookID1 = scanner.nextInt(); 
		                    int bookID2 = scanner.nextInt(); 
		                    bookStack.push(bookID1, bookID2); 
		                    break; 
		 
		                case 3: 
		                    bookStack.pop(); 
		                    break; 
		 
		                case 4: 
		                    System.out.print("Enter the number of books to be popped: "); 
		                    int n = scanner.nextInt(); 
		                    bookStack.pop(n); 
		                    break; 
		 
		                case 5: 
		                    bookStack.display(); 
		 
		
		  
		                    break; 
		 
		                case 6: 
		                    System.out.print("Enter the number of top books to display: "); 
		                    int topN = scanner.nextInt(); 
		                    bookStack.display(topN); 
		                    break; 
		 
		 
		                default: 
		                    System.out.println("Invalid choice. Please try again."); 
		            } 
		 
		        } while (choice != 6); 
		 
		        scanner.close(); 
		    } 
		}
		


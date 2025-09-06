package stackpersons;
import java.util.*;

public class TicketCounterStack {
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				Stack st = null;

				System.out.println("Choose initialization:");
				System.out.println("1. Empty stack with size");
				System.out.println("2. Stack initialized with array of Persons");
				int choice = sc.nextInt();

				if (choice == 1) {
				    System.out.print("Enter size: ");
				    int size = sc.nextInt();
				    st = new Stack(size);
				} else if (choice == 2) {
				    System.out.print("Enter number of Persons: ");
				    int n = sc.nextInt();
				    sc.nextLine();
				    Person arr[] = new Person[n];
				    for (int i = 0; i < n; i++) {
				    	 System.out.println("Enter details for Person " + (i + 1) + ":");
				         System.out.print("Name: ");
				         String name = sc.nextLine();
				         System.out.print("Age: ");
				         int age = sc.nextInt();
				         sc.nextLine(); 
				         System.out.print("Gender (MALE/FEMALE/OTHER): ");
				         Gender gender = Gender.valueOf(sc.nextLine().toUpperCase());
				         arr[i] = new Person(name, age, gender);
				     }
				     st = new Stack(arr);
				 }
				int option;
				do {
				    System.out.println("\n--- Menu ---");
				    System.out.println("1. Push one Person");
				    System.out.println("2. Push two Persons");
				    System.out.println("3. Pop one Person");
				    System.out.println("4. Pop multiple Persons");
				    System.out.println("5. Display all Persons");
				    System.out.println("6. Display top n Persons");
				    System.out.println("7. Exit");
				    System.out.print("Enter your choice: ");
				    option = sc.nextInt();
				    
				    switch(option) {
				    case 1:
				    	 sc.nextLine();
				    	 System.out.println("Enter name: ");
				         String name1 = sc.nextLine();
				         System.out.println("Enter age: ");
				         int age1 = sc.nextInt();
				         sc.nextLine();
				         System.out.println("Enter gender (MALE/FEMALE/OTHER): ");
				         Gender gender1 = Gender.valueOf(sc.nextLine().toUpperCase());
				         Person p1 = new Person(name1, age1, gender1);
				         st.push(p1);
				         break;
				    case 2:
				    	 sc.nextLine();
				    	 System.out.println("Enter details for first Person:");
				         System.out.print("Name: ");
				         String name2 = sc.nextLine();
				         System.out.print("Age: ");
				         int age2 = sc.nextInt();
				         sc.nextLine();
				         System.out.print("Gender (MALE/FEMALE/OTHER): ");
				         Gender gender2 = Gender.valueOf(sc.nextLine().toUpperCase());
				         Person p2 = new Person(name2, age2, gender2);
				         
				         System.out.println("Enter details for second Person:");
				         System.out.print("Name: ");
				         String name3 = sc.nextLine();
				         System.out.print("Age: ");
				         int age3 = sc.nextInt();
				         sc.nextLine();
				         System.out.print("Gender (MALE/FEMALE/OTHER): ");
				         Gender gender3 = Gender.valueOf(sc.nextLine().toUpperCase());
				         Person p3 = new Person(name3, age3, gender3);

				         st.push(p2, p3);
				         break;

				     case 3:
				         Person popped = st.pop();
				         if (popped != null) {
				             System.out.println("Popped Person:");
				             popped.displayPerson();
				         }
				         break;

				     case 4:
				         System.out.print("Enter number of Persons to pop: ");
				         int n = sc.nextInt();
				         st.pop(n);
				         break;

				     case 5:
				    	 st.display();
				         break;

				     case 6:
				         System.out.print("Enter number of top Persons: ");
				         int topN = sc.nextInt();
				         st.display(topN);
				         break;

				     case 7:
				         System.out.println("Exiting...");
				         break;

				     default:
				         System.out.println("Invalid choice!");
				 }
				}
				    while(option!=7);
			}
	        }
	       }
         
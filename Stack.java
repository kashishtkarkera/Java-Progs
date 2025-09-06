package stackpersons;

public class Stack {
	   Person arr[];
	   int top;
	   int capacity;
	   
	   Stack(int size) {
		   capacity = size;
		   arr = new Person[capacity];
		   top = -1;
	   }
	   Stack(Person[] inputArr) {
		   capacity = inputArr.length;
	       arr = new Person[capacity];
	       top = -1;
	       for (Person p : inputArr)
	       {
	         if (top < capacity - 1) {
	                arr[++top] = p;
	            } 
	            else {
	                System.out.println("Stack overflow while initializing from array!");
	                break;
	                 }
	             }
	          }
	   void push(Person p) {
		   if (top == capacity - 1) {
	       System.out.println("Stack Overflow! Cannot push " + p);
	       return;
	        }
	        arr[++top] = p;
	        System.out.println("Person pushed.");
	    }
	   void push(Person p1, Person p2) {
		   push(p1);
	       push(p2);
	   }
	   Person pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow! No person to pop.");
	            return null;
	        }
	        return arr[top--];
	    }
       	void pop(int n) {
           if (n > top + 1) {
           System.out.println("Cannot pop " + n + " Persons. Stack has only " + (top + 1));
          } 
           else {
    System.out.println("Popped " + n + " Persons:");
       for (int i = 0; i < n; i++) {
          arr[top--].displayPerson();
    }
  }
}
       void display() {
           if (top == -1) {
               System.out.println("Stack is empty.");
           } else {
               System.out.println("Full stack (top to bottom):");
               for (int i = top; i >= 0; i--) {
                   arr[i].displayPerson();
               }
           }
       }
       void display(int n) {
           if (n > top + 1) {
               System.out.println("Only " + (top + 1) + " Persons in stack. Displaying all:");
               display();
           } else {
               System.out.println("Top " + n + " Persons:");
               for (int i = top; i > top - n; i--) {
                   arr[i].displayPerson();
               }
           }
       }
   }
        

	
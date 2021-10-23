package Assignments;
//Use LinkedList only in the below program
//- Add 6 months (May, June, July, August, April, November)
//- Add 'December' month as last
//- Add 'January' month as first
//- Add 'March' and then add 'Febuary' using the index based 
//- Add 'Septemeber' and then add 'October' using the index based
//(1) Print the linkedlist in such a way that proper order of months are displayed
//(2) Get all the even months and print them 
//(3) Get all the odd months and print them
//(4) Use iterator to fetch and print all months 
//(5) Print the first and last month of the year together
//(6) remove your birthday month from the linkedList and print it
//(7) Check whether this linkedList contains any winter month inside it or not?

import java.util.Iterator;
import java.util.LinkedList;

public class MonthsLinkedList {
public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("April");
		ll.add("November");
		System.out.println("Linkedlist:" + ll);
		
		
		ll.addLast("December");
		ll.addFirst("January");
		System.out.println("Linkedlist:" + ll);
		ll.add(2, "March");
		ll.add(3, "February");
		System.out.println("Linkedlist:" + ll);
		ll.add(8, "September");
		ll.add(9, "October");
		System.out.println("Linkedlist:" + ll);
		ll.set(1, "February");
		ll.remove("April");
		ll.set(3, "April");
		ll.set(4,"May");
		ll.add(5,"June");
		
		System.out.println("Linkedlist:" + ll);
		
		Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println(itr.next());
        }
        System.out.println("The first month is: " +ll.getFirst());
        System.out.println("The last month is: " +ll.getLast());
        ll.remove("August");
        System.out.println("The deleted month is: August");
        System.out.println("Linkedlist:" + ll);
        
        
		
				
}
}




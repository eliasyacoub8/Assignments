package Assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(9);
		ll.add(19);
		ll.add(32.56f);
		ll.add(14f);
		ll.add('M');
		ll.add('c');
		ll.add(true);
		
		Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println(itr.next());
        }
	
        LinkedList ll2=new LinkedList();
        ll2.add(8);
        ll2.add(4);
        
        ll2.sort(null);
        
        Iterator itr2=ll2.iterator();
        while(itr2.hasNext()) {
        System.out.println(itr2.next());
        
        }        
		
	}
}




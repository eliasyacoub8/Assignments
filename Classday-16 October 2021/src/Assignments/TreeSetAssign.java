package Assignments;

import java.util.TreeSet;

//Create one object of treeset and add the
//any 6 programming languages in random order
 // - remove two languages
  //- add three more after removal
  //- Check if " Java" is part of your treeset or not
  //- remove all the elements from the treeset and display it


public class TreeSetAssign {
	public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        
        treeSet.add("Java");
        treeSet.add("C++");
        treeSet.add("Python");
        treeSet.add("COBOL");
        treeSet.add("Kotlin");
        treeSet.add("SQL");
        
        System.out.println("TreeSet is : " + treeSet);
        treeSet.remove("C++");
        treeSet.remove("SQL");
        System.out.println("TreeSet is : " + treeSet);
        
        treeSet.add("C");
        treeSet.add("Swift");
        treeSet.add("TypeScript");
        System.out.println("TreeSet is : " + treeSet);
        
       
		treeSet.contains("Java");
		System.out.println(treeSet.contains("Java"));
        treeSet.removeAll(treeSet);
        System.out.println("TreeSet is : " + treeSet);
        
        
	}

}

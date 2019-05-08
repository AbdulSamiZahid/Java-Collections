
package javaa2x;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class JavaA2X {

  
    public static void main(String[] args) {
       
    Vector alphaVector = new Vector();
   
    alphaVector.add("Abdul");
    alphaVector.add("Sami");
    alphaVector.add("Zahid");
   
  
    System.out.println("Displaying vectors");
    System.out.println(alphaVector.get(0));
    System.out.println(alphaVector.get(1));
    System.out.println(alphaVector.get(2));
    
    System.out.println();
    System.out.println("Displaying Array List");
    ArrayList <String> alphaArray=new ArrayList<String>();   
      alphaArray.add("Abdul");   
      alphaArray.add("Sami");    
      alphaArray.add("Zahid");      
      
      System.out.println(alphaArray);  
    System.out.println();
    System.out.println("Displaying Sorted Set");
    
    SortedSet<String> alphaSortedSet = new TreeSet<>(); 
         
        alphaSortedSet.add("Abdul"); 
        alphaSortedSet.add("Sami"); 
        alphaSortedSet.add("Zahid"); 
  
        System.out.println("Sorted Set: " + alphaSortedSet);
  }
    

    }
    

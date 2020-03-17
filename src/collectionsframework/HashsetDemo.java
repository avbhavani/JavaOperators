package collectionsframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashsetDemo {


	public static void main(String[] args) {
		  // used to store values but values are not stored in proper index, they are stored and will print 
		//randomly 
		  
		  HashSet<String> hset= new HashSet<String>();
		  
		  hset.add("selenium");
		  hset.add("Java");
		  hset.add("PHP");
		  hset.add("Ruby");
		  
		   //To print the array List values one by one , get() method is not applicable to HashSet 
		  // System.out.println( hset(0)); method is not applicable to HashSet 
		   
		    
		    // OR use for loop of for each loop -- not applicable to HashSet
		    
		    /*for (int i=0; i<aList.size();i++)
		    {
		     System.out.println(aList.get(i));
		    }*/
		   
		  
		  //Use for each loop to fetch data of a HashSet 
		  
		  for(String tem:hset)
		  {
		   System.out.println(tem);
		  }
		//Iterator for Hashset String
		  Iterator<String> iset = hset.iterator();
		  while(iset.hasNext())
		  {
		System.out.println(iset.next());	  
		  }
		  
HashSet <Integer> yset = new HashSet <Integer>();
   yset.add(10);
   yset.add(20);
   yset.add(30);
   yset.add(40);
 for (Integer R:yset)
 {
	   //System.out.println(yset);// all in one line
	   System.out.println(R);   
	  }

Iterator<Integer> itr =yset.iterator(); // Iterator for Hashset Integer
 
// if the yset iteration has values in it, than itr.hasNext()  is going to return true
//ArrayList= (1,2,3,4,5)
 while(itr.hasNext())
 {
  System.out.println(itr.next());
 }

 
 //Hashmap
 HashMap <Integer,String> hmap = new HashMap<Integer,String>();
	   
    hmap.put(0, "pizza");
    hmap.put(2, "burger");
    hmap.put(3, "veggi");
    hmap.put(1, "salad");
 
    
    System.out.println(hmap.get(2));
    for(Map.Entry<Integer, String> m:hmap.entrySet())
    {    
	       System.out.println(m.getKey()+" "+m.getValue()); 
    } 
    
    //Iterator for Hasmap we can't do because it has tow data types
   
                             }
    
	}



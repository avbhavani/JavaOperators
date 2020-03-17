package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args){
	 
		  /* HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		       
		      System.out.println("After invoking put() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		        
		      hm.putIfAbsent(103, "Gaurav");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());  
		           */
		           
		             //eg1	             
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
		             
		    hmap.put(101, "Sonal");
		     hmap.put(102, "Tom");
		         hmap.put(103, "sara");
		             
// to fetch the values
	System.out.println(hmap.get(101));
 //or for each loop
		             
 for(Integer temp:hmap.keySet())
		   {
		        System.out.println(hmap.get(temp));
		             }
//eg2 // with two char data
 HashMap<String,String> hmap1 = new HashMap<String,String> ();
   hmap1.put("01jas", "ake");
   hmap1.put("02rish", "ake");
   hmap1.put("03gan", "ake");
   hmap1.put("04ven", "ake");
  /*// System.out.println(hmap1);// one value
   
   for ( String temp1:hmap1.keySet())
	   {System.out.println(hmap1.get(temp1));
                          }  */
   for (String temp1:hmap1.keySet())
                          {System.out.println(hmap1.get(temp1)+ " "+hmap1.get(temp1));
   
   
   //eg 3   // key and value together with space
   for(Map.Entry<String, String> hmap2:hmap1.entrySet()) // map interface// Entry method
   {    
	       System.out.println(hmap2.getKey()+" "+hmap2.getValue()); 
               } 
                     
	            }  
	}
		 }  
	
		

	



package practice;

public class Multidimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] arrM= {{"java","selenium","C++","Python","PHP"},{"selenium","loadrunner","UFT","RPT"},{"1","2","3","4"}};
		
	for (int i =0; i<arrM.length;i++  ) //this for loop is for mother array //when an mother array has more than one length then we can write code by using length keyword 
		                                      
    for (int j =0; j<arrM.length;j++ ) //this is for child array// in this instance mother array has three indexes 0,1,2 each has minimum 4 data values(index 0,1,2,3,4..)
		
	{System.out.println((arrM[i][j]));
	                             }
	// second type
		String [] [] arrh= {{"java","selenium","C++","Python","PHP"},{"selenium","loadrunner","UFT","RPT"},{"1","2","3","4"}};
		
		for (int k =0; k<arrh.length;k++  )// here we are giving array length 4 directly without length keyword
			                        
			for (int l =0; l<arrh.length;l++ )
			
	{System.out.println(arrh[k][l]);
	                        }
	 
	//3rd example // all the time array length should not exeed than mother array..if so we should give array name(eg:i <arr4)so it will pull length by itself.
	  int [][] arr4 = {{1,2,3,4,5},{7,8,9,10},{21,22,23,24,25,26}};//
	  
	  for(int m=0;m<arr4.length;m++)  //i=1
	  {
	   for(int n=0;n<arr4[m].length;n++) // arr4[2].length=6// here we have given mother array variable name m also
		   // in child array for loop
	   
	    {System.out.println(arr4[m][n]);  // arr4[1][0]
	             }
	                   }
	       
                            }
                                }
	           
                
                 
                    
                   
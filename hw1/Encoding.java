/* morseCodes class that takes 2 integers (m dots, n dashes)
 * and displays the possible permutations. Tree is used to not 
 * display multiple same elements.
 * 
 * The for loop syntax used is intended to maintain the scope of the 
 * str variable.
 * 
 */



import java.util.*;

public class Encoding{
		
   public static Set<String> morseCodes(int m, int n){
	   
      Set<String> result = new TreeSet<>();
      
      //BASE CASE
      if ((m == 0) && (n == 0)){ // BASE CASE
    	  
    	  result.add(""); // initialize result @ end
      }
     
      
      
      else if (n == 0) // LEAD TO BASE CASE - start subtracting other letter
    	  {
    	  for (String str : morseCodes(m-1, n)){
        	  result.add(str + ".");
          }
      }
      
      
      else if (m == 0){ // LEAD TO BASE CASE - start subtracting other letter
    	  
    	  for (String str : morseCodes(m, n-1)){
    		  
        	  result.add(str + "-");
          }
      }
      
      else{ // M = . N = -	
    	  
          for (String str : morseCodes(m, n-1)){
        	  
        	  result.add(str + "-");
          }
          
    	  for (String str : morseCodes(m-1, n)){
    		  
        	  result.add(str + ".");
          }
          
      }
      
      
      
      return result;
   }

   
   public static void main(String args[]) {
	   
	   System.out.println(morseCodes(2,3));
   }
}

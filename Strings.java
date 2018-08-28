/* Strings class that returns the unique letters in a word (used once)
 * 
 * 
*/


public class Strings{
	
	public static String uniqueLetters(String str) {
		//uniqueLetters("harrasses") should return "he";
		
		char[] charArray = str.toCharArray();
		String ULStr = "";
		
		for(int i = 0; i<charArray.length; i++) {
			
			int counter = 0;
			
			for(int j = 0; j <charArray.length; j++) {
				
				
				if(charArray[i] == charArray[j]) {
					counter++;					
				}
							
			}
			
			if(counter==1) {
				ULStr = ULStr + charArray[i];
			}
		
		}
		
		return ULStr;
	}
	
	
}

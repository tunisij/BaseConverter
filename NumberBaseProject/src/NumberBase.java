import java.util.*;


public class NumberBase {

	private static int i;
	
	private static int sum;

	public NumberBase(){
		i = 0;
	}

	public static String convert(String input, int base_in, int base_out){

		ArrayList <Integer> result = new ArrayList <Integer>();
		String str = "";

		for (int index = 0; index < input.length(); index++) {
			char aChar = input.charAt(index);
			sum = Character.getNumericValue(aChar);
				
			if(sum >= base_in || sum < 0)
				throw new IllegalArgumentException();

			result.add(sum);
		}

		i = 0;
		sum = 0;
		
		while(i < result.size()){
			sum += (int) (result.get(result.size()-1-i))*(Math.pow(base_in, i));
			i++;
			
		}
		str = "" + sum;
		
		if(base_out != 10){
			str = fromBaseTen(sum, base_out);
		}
		if(str == ""){
			str = "" + 0;
		}
		return str;
		
	}
	
	public static String fromBaseTen(int sum,int base_out)
	{
	String answer="";
		
	while(sum > 0){
			i = sum%base_out;
	        
			if(i > 9){
	        	i += 55;
	            char c= (char)i;
	            answer = c + answer;
	        
			}else{
	        	answer = i + answer;
	        }
	        sum = sum/base_out;
		}
	    return answer;
	}
}
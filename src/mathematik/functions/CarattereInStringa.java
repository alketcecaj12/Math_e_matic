package mathematik.functions;

public class CarattereInStringa {

	
	public static void main (String[]args){
		
		char [] c = {'a', 'b', 'c', 'f', 'a', 'e', 'a', 'a'};
		char s = 'a';
		System.out.println(contaCaratteri(c,s));
		
	}
	
	public static int contaCaratteri(char[] s, char c){
		
	 int result = 0;
		
	  for(int i =0; i<s.length; i++){
		
		if(s[i]==c){
			
			result++;
		}
      }
	
	return result;
	}
	
}

package array.execices;

public class CountMethods {

	
	public static int countChars(char c, String s) {
		  int result = 0;
		  for (int i = 0, n = s.length(); i < n; i++) {
		    if (s.charAt(i) == c) {
		      result++;
		    }
		  }
		  return result;
		}
	
}

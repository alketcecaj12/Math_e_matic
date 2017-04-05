package array.execices;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main2CountMethods {

	
	public static void main (String[] args){
	String a = "anagramma";
    int[] counter = new int[a.length()];
    int count = 0; 
	for (int i = 0; i < a.length(); i++) {
		
	counter[i] = CountMethods.countChars(a.charAt(i), a);
		
	}
	for (int i = 0; i < counter.length; i++) {
		
		System.out.println(a.charAt(i)+", "+counter[i]);
	}
	
	// un altro metodo per eseguire lo stesso compito con risultato leggermente diverso
	
	String s1="parasanna";

	StringBuffer sb=new StringBuffer();
	boolean print = false;
	for (int i=0; i<s1.length(); i++){
	    int counter2=1;
	    char c=s1.charAt(i);
	    sb.append(c);
	    for (int j=1; j<sb.length(); j++) {
	        char c2=sb.charAt(j-1);
	        if (c==c2) {
	            counter2++;
	        }
	    }

	    System.out.println(c+"=="+counter2);

	}
	
	}
	
	
	
}

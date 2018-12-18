package AkunaCapital;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class anagramSentences {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("act", "in", "it", "cat"); 
		List<String> sentences = Arrays.asList("act in it cat");

		List<Long> results = countSentences(words, sentences);
	}
	public static List<Long> countSentences(List<String> wordSet, List<String> sentences) {
	    Set a = new HashSet<String>();
	    for (String x : wordSet) 
            a.add(x);
	    for (String i : a) {
	    	  for(String j : a)
	    	  {
	    		  permute(j, 0, j.length()-1); 
	    	  }
	    	}
		return null; 
    }
	private static void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 

    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}

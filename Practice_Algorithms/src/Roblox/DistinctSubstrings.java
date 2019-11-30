package Roblox;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubstrings {
	public static void main(String args[]) {
	    // create a hash set

	    String s = "aba";
	    int L = s.length();
	    Set<String> hs = new HashSet<String>();
	    // add elements to the hash set
	    for (int i = 0; i < L; ++i) {
	      for (int j = 0; j < (L - i); ++j) {
	        hs.add(s.substring(j, i + j + 1));
	        System.out.println(s.substring(j, i + j + 1));
	      }
	    }
	    System.out.println(hs.size());
	  }
}

package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

// Top k frequent words in reviews



/*
Approach: We can split the words in each review. We also store all the keywords in a keyword bank. Then for each review and each word in the review we check if this word exists in our keyword bank(set) we store the count of that in our map (this map, maps keywords to their counts).

Since we don't want to count multiple occurrences of keywords in a single review instead want to check for their presence in them(this is a bit like boolean: is the review present or not?), we can maintain a Set for each review to keep track of whether we have seen the keywords before. 

Once our Map is set up we create a min-Heap(via Priority Queues) over our map's keySet and make sure it's size is always less than k. Then traverse this heap and add to results. Before returning we need to reverse it as the order will increasing right now.

Time Complexity: 
We setup our Map in O(N*L) time where N is the total number of reviews and L is the avg(words in a review), i.e in a Worst-case we can have N reviews of length N each and we go over each word. We can still simplify it as O(M) where M is the total # of words in reviews.

We create our Min-Heap in N*Logk time and then run over our heap in O(k) time to add to arraylist and reverse in O(k) time.

Finally, O(M + NlogK)

Space: O(max(k,n)) where n:keywords.length (stored in map and set) k nodes in PQ*/


public class TopFreq {

	public static void main(String[] args) {
		String[] keywords = {"elmo", "elsa", "aba"};
		String[] reviews = {"elmo elmo"};
		List<String> list = solve(2, keywords, reviews);
		System.out.print(list);

	}
	
	private static List<String> solve(int k, String[] keywords, String[] reviews) {
		List<String> res = new ArrayList<>(); 

		Set<String> kewordBank = new HashSet<>(Arrays.asList(keywords));
		Map<String, Integer> map = new HashMap<>();
	    for(String review : reviews) {
	        String[] words = review.split("\\W");
	        Set<String> uniqueWords = new HashSet<>();
	        for(String eachWord: words) {
	            String word = eachWord.toLowerCase();
	            if(kewordBank.contains(word) && !uniqueWords.contains(word)){
	                map.put(word, map.getOrDefault(word, 0) + 1);
	                uniqueWords.add(word);
	            }
	        }
	    }
	    //map built 
	    //set up PQ
	    PriorityQueue<String> minHeap = new PriorityQueue<String>((n2,n1)->map.get(n2).equals(map.get(n1))?n1.compareTo(n2):(map.get(n2)-map.get(n1)));
	    for(String keyword: map.keySet()) {
	        if(minHeap.size()>=k)
	            minHeap.poll();
	        minHeap.add(keyword);
	    }
	    List<String> result = new ArrayList<>(); 
	    int count = k;                                                                                                               
	    while(count-- > 0 && !minHeap.isEmpty()) {
	        result.add(minHeap.poll());
	    }
	  
		Collections.reverse(result);
	    return result;
	}
	
}

package amazon;

import java.util.*;
/**
 * You are given a list of product IDs and their product review scores,
 * encapsulated in the given class. Each product has at least 5 scores.
 * 
 * Compute the 'most positive aggregate review score' (maps) for each product,
 * which is the sum of its highest 5 scores divided by 5. Return a mapping of
 * IDs to their maps.
 * 
 */
public class Top5Reviews {
public static void main(String[] args) {
	Reviews prod1 = new Reviews("p1", 4);
	Reviews prod2 = new Reviews("p2", 9);
	Reviews prod3 = new Reviews("p1", 5);
	Reviews prod4 = new Reviews("p2", 8);
	Reviews prod5 = new Reviews("p2", 8);
	Reviews prod6 = new Reviews("p1", 6);
	Reviews prod7 = new Reviews("p1", 7);
	Reviews prod8 = new Reviews("p1", 8);
	Reviews prod9 = new Reviews("p1", 9);
	Reviews prod10 = new Reviews("p1", 10);
	Reviews prod11= new Reviews("p2", 9.5);
	Reviews prod12 = new Reviews("p2", 10);
	Reviews prod13 = new Reviews("p2", 5);
	
	ArrayList<Reviews> list = new ArrayList<>();
	list.add(prod1);
	list.add(prod2);
	list.add(prod3);
	list.add(prod4);
	list.add(prod5);
	list.add(prod6);
	list.add(prod7);
	list.add(prod8);
	list.add(prod9);
	list.add(prod10);
	list.add(prod11);
	list.add(prod12);
	list.add(prod13);
	int k = 13;
	System.out.println(AvgReviewScore(k, list));
}

private static Map<String, Double> AvgReviewScore(int k, ArrayList<Reviews> list) {
	Map<String, PriorityQueue<Double>> idScore = new HashMap<>();
	for(Reviews i : list)
	{
		String id = i.id;
		PriorityQueue<Double> scoreOfProd = idScore.getOrDefault(id, new PriorityQueue<Double>(5, Collections.reverseOrder()));
		scoreOfProd.add(i.score);
		idScore.put(id, scoreOfProd);
	}
	//Now find average
	Map<String, Double> result = new HashMap<>();
	for(String id : idScore.keySet())
	{
		PriorityQueue<Double> scoreOfProd = idScore.get(id);
		double sum = 0;
		for(int i=0;i<5;i++)
		{
			sum+= scoreOfProd.poll();
		}
		sum/=5;
		result.put(id, sum);
		
	}
	return result;
}
}
class Reviews{
	String id;
	double score;
	public Reviews(String id, double score)
	{
		this.id = id;
		this.score = score;
	}
}

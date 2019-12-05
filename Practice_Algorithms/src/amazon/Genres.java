package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//from collections import defaultdict
//
//def favoriteVideoGenre(numUsers, userVideosWatched, numGenres, videoGenres):
//
//    #Dictionary with key = movie and value = genre
//    myDict = {}
//
//
//    outputDict = defaultdict(list)
//
//##Iterate over videoGenres to create a reversed dictionary O(N^2)
//    for genre in videoGenres:
//        for movie in videoGenres[genre]:
//            myDict[movie] = genre
//
//
//##
//    for user in userVideosWatched:
//        insideDict  = {}
//        maxVal = 0
//        for movie in userVideosWatched[user]:
//            if movie in myDict: ##To check if the movie exists. Just to be safe about what if the given dictionary does not have that movie
//                if myDict[movie] in insideDict:
//                    insideDict[myDict[movie]]+=1
//                    maxVal = max(maxVal, insideDict[myDict[movie]])
//                else:
//                    insideDict[myDict[movie]] = 1
//                    maxVal = max(maxVal, insideDict[myDict[movie]])
//
//        c = [k for k,v in insideDict.items() if v == maxVal]
//
//        outputDict[user] = c
//    return outputDict

public class Genres {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> userSongs = new HashMap<>();
		ArrayList<String> a = new ArrayList<>();
		a.add("song1");
		a.add("song2");
		a.add("song3");
		a.add("song4");
		a.add("song8");	
		userSongs.put("David",a);
				
		ArrayList<String> b = new ArrayList<>();
		b.add("song5");
		b.add("song6");
		b.add("song7");
		userSongs.put("Emma",b);
		
		HashMap<String, ArrayList<String>> songGenres = new HashMap<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		ArrayList<String> e = new ArrayList<>();
		ArrayList<String> f = new ArrayList<>();
		ArrayList<String> g = new ArrayList<>();
		c.add("song1");
		c.add("song3");
		d.add("song7");
		e.add("song2");
		e.add("song4");
		f.add("song5");
		f.add("song6");
		g.add("song8");
		g.add("song9");
		
		songGenres.put("Rock", c);
		songGenres.put("Dubstep", d);
		songGenres.put("Techno", e);
		songGenres.put("Pop", f);
		songGenres.put("Jazz", g);
		
		Map<String,List<String>> ans = favoritegenre(userSongs, songGenres);
		System.out.println(ans);
	}
	public static Map<String, List<String>> favoritegenre(HashMap<String,ArrayList<String>> userSongs, HashMap<String, ArrayList<String>> songGenres) 
	{
	   	Map<String, List<String>> res = new HashMap<>();
	   	Map<String, String> songstogenre = new HashMap<>();
	   	
	   	for(String genre : songGenres.keySet()) 
	   	{
	   		List<String> songs = songGenres.get(genre);
	   		for(String song : songs) 
	   		{
	   			songstogenre.put(song, genre);
	   		}
	   	}
	   	
	    Map<String, Integer> count = new HashMap<>();
	   	int max = 0;
	   	for(String user : userSongs.keySet()) 
	   	{
            count = new HashMap<>();
            max = 0;
            res.put(user, new ArrayList<>());
	   		List<String> songs = userSongs.get(user);
	   		for(String song : songs) 
	   		{
	   			String genre = songstogenre.get(song);
	   			int c = count.getOrDefault(genre, 0) + 1;
	   			count.put(genre, c);
	            max = Math.max(c, max);
	   		}
           for (String key : count.keySet()) 
           {
               if (count.get(key) == max)
               {
                   res.get(user).add(key);
               }
           }
	   	}
	   	return res;
	}
}

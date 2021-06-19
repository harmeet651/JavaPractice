package Peak6;
import java.util.*;
public class KangarooWord {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		ArrayList<String> syn = new ArrayList<>();
		ArrayList<String> any = new ArrayList<>();
		words.add("aStouND");
		words.add("DeSK");
		words.add("AmicABLe");
		words.add("blossOM");
		words.add("hEllO");
		words.add("AnIMOsitY");
		words.add("BARren");
		words.add("cUrTaiL");
		words.add("DePArTed");
		words.add("ScioN");
		words.add("gOOdBYE");
		
		syn.add("GOOdbye:adIeu,Adios,CiAO,paRTINg");
		syn.add("ANIMOSItY:haTe");
		syn.add("BaRren:bARE");
		syn.add("sCioN:SoN,HEir,bRaNCH");
		syn.add("curtaIL:cUt");
		
		any.add("animoSiTY:aMIty");
		any.add("HeLLO:gOOdbyE");
		
//		syn.add("encourage:urge,encourage");
//		syn.add("encourage:boost");
//		syn.add("encourage:inspire");
//		
//		any.add("encourage:en");
//		
//		syn.add("container:tin");
//		syn.add("container:can");
//		syn.add("container:bottle");
		int ans = count(words, syn, any);
		System.out.println(ans);
	}

	private static int count(ArrayList<String> words, ArrayList<String> syn, ArrayList<String> any) 
	{
		int c=0;
		for(String word : words)
		{
			for(String s : syn)
			{
				String[] parts = s.toLowerCase().split(":");
				String[] other = parts[1].toLowerCase().split(",");
				HashMap<Character, Integer> synMap = new HashMap<>();
				if(word.toLowerCase().equals(parts[0]))
				{
					for(int j=0;j<word.length();j++)
					{
						if(synMap.containsKey(word.toLowerCase().charAt(j)))
						{
							int value = synMap.get(word.toLowerCase().charAt(j));
							synMap.put(word.toLowerCase().charAt(j),value+1);
						}
						else
						{
							synMap.put(word.toLowerCase().charAt(j),1);
						}
					}

					for(int q=0;q<other.length;q++)
					{
						if(parts[0].toLowerCase().equals(other[q].toLowerCase()))
						{
							continue;
						}
						else
						{
							int flag = 0;
							for(int k=0;k<other[q].length();k++)
							{
								if(synMap.containsKey(other[q].toLowerCase().charAt(k)))
								{
									flag = 1;
									continue;
								}
								else
								{
									flag = 0;
									break;
								}
							}
							if(flag==1)
							{
								c++;
							}
						}
					}		
				}
			}
			for(String s : any)
			{
				String[] parts = s.toLowerCase().split(":");
				String[] other = parts[1].toLowerCase().split(",");
				HashMap<Character, Integer> synMap = new HashMap<>();
				if(word.toLowerCase().equals(parts[0]))
				{
					for(int j=0;j<word.length();j++)
					{
						if(synMap.containsKey(word.toLowerCase().charAt(j)))
						{
							int value = synMap.get(word.toLowerCase().charAt(j));
							synMap.put(word.toLowerCase().charAt(j),value+1);
						}
						else
						{
							synMap.put(word.toLowerCase().charAt(j),1);
						}
					}
					for(int q=0;q<other.length;q++)
					{
						if(parts[0].toLowerCase().equals(other[q].toLowerCase()))
						{
							continue;
						}
						else
						{
							int flag = 0;
							for(int k=0;k<other[q].length();k++)
							{
								if(synMap.containsKey(other[q].toLowerCase().charAt(k)))
								{
									flag = 1;
									continue;
								}
								else
								{
									flag = 0;
									break;
								}
							}
							if(flag==1)
							{
								c--;
							}
						}
					}		
				}
			}
		}
		return c;
	}

}

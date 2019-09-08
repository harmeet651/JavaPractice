package GoldmanSachs;

import java.util.ArrayList;
import java.util.List;

public class GridQuestion {

	public static void main(String[] args) {
		List<List<Integer>> grid = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		temp.add(0);
		temp.add(1);
		temp.add(0);
		temp.add(0);
		List<Integer> temp2 = new ArrayList<>();
		temp2.add(0);
		temp2.add(0);
		temp2.add(0);
		temp2.add(0);
		grid.add(temp);
		grid.add(temp2);
		int k = 2;
		List<String> rules = new ArrayList<>();
		rules.add("dead");
		rules.add("alive");
		rules.add("dead");
		rules.add("dead");
		rules.add("dead");
		rules.add("alive");
		rules.add("dead");
		rules.add("dead");
		rules.add("dead");
		
		List<List<Integer>> ans = fun(grid,k,rules);
		for(int i=0;i<ans.size();i++)
		{
			for(int j=0;j<ans.get(0).size();j++)
			{
//				System.out.println(ans.get(i).get(j));
			}
		}
	}
	public static List<List<Integer>> funHelper(List<List<Integer>> grid,int k,List<String> rules,int[][] countGrid)
	{	
		if(k==0) 
		{
			return grid;
		}
		for(int i=0;i<grid.size();i++) 
		{
			for(int j=0;j<grid.get(i).size();j++) 
			{
				if(i-1>=0 && j-1>=0) {
					if(grid.get(i-1).get(j-1)==1){
						countGrid[i][j]+=1;
					}
				}
				if(i-1>=0) {
					if(grid.get(i-1).get(j)==1){
						countGrid[i][j]+=1;
					}
				}
				if(j-1>=0) {
					if(grid.get(i).get(j-1)==1){
						countGrid[i][j]+=1;
					}
				}
				if(i-1>=0 && j+1< grid.get(0).size()) {
					if(grid.get(i-1).get(j+1)==1){
						countGrid[i][j]+=1;
					}
				}
				if(j+1< grid.get(0).size()) {
					if(grid.get(i).get(j+1)==1){
						countGrid[i][j]+=1;
					}
				}
				
				if(i+1<grid.size() && j-1>=0) {
					if(grid.get(i+1).get(j-1)==1){
						countGrid[i][j]+=1;
					}
				}
				
				if(i+1<grid.size()) {
					if(grid.get(i+1).get(j)==1){
						countGrid[i][j]+=1;
					}
				}
				if(i+1<grid.size() && j+1<grid.get(0).size()) {
					if(grid.get(i+1).get(j+1)==1){
						countGrid[i][j]+=1;
					}
				}				
			}
		}
		System.out.println("NEIGHBOUR GRID");
		for(int i=0;i<grid.size();i++)
		{
			for(int j=0;j<grid.get(0).size();j++)
			{
				System.out.print(countGrid[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("GRID");
		for(int i=0;i<grid.size();i++)
		{
			for(int j=0;j<grid.get(0).size();j++)
			{
				if(grid.get(i).get(j)==1) {
					grid.get(i).set(j,0);
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<rules.size();i++)
		{

			if(rules.get(i).equals("alive")) {
				
				for(int x=0;x<countGrid.length;x++) {
					for(int y=0;y<countGrid[0].length;y++) {
						if(countGrid[x][y]==i) {
							grid.get(x).set(y,1);
						}
						else {
							
						}
						
					}
				}
			}
			
			
		}
	
		System.out.println("GRID");
		for(int i=0;i<grid.size();i++)
		{
			for(int j=0;j<grid.get(0).size();j++)
			{
				System.out.println(grid.get(i).get(j)+" ");
			}
			System.out.println();
		}
		countGrid=new int[grid.size()][grid.get(0).size()];
		return funHelper(grid,k-1,rules,countGrid);		
	}
	public static List<List<Integer>> fun(List<List<Integer>> grid,int k,List<String> rules){
		
		int[][] countGrid=new int[grid.size()][grid.get(0).size()];
		return funHelper(grid,k,rules,countGrid);
		
		
	}
}

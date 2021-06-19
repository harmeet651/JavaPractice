package Audible;

import java.util.*;
public class Cost {
	public static void main(String[] args) { 
        Scanner scanner=new Scanner(System.in); 
        int costpercut=scanner.nextInt(); 
        int price=scanner.nextInt(); 
        int n=scanner.nextInt(); 
        int arr[] =new int[n]; 
        for (int j = 0; j < n; j++) 
        { 
            arr[j]=scanner.nextInt(); 
            
        } 
        int max = arr[0]; 
        int maxProfit = 0; 
        for(int i = 0 ; i < arr.length; i++) 
           if(max < arr[i]) max = arr[i]; 
        for(int size = 1 ; size <= max; size++) 
        { 
            int profit = 0; 
            for(int i = 0 ; i < arr.length; i++) 
            { 
               if(size > arr[i]) continue; 
               int currPrice = (arr[i] / size) * price * size; 
               // current Rod price after cutting it.
               int cuts = arr[i] % size == 0 ? (arr[i] / size) - 1 : (arr[i] / size); 
               // Number of cuts depend on the length of rod. 
               int currProfit = currPrice - costpercut * cuts; 
               if(currProfit > 0) profit += currProfit; 
                
            } 
               if(profit > maxProfit) maxProfit = profit; 
            
        } 
               System.out.println(maxProfit); 
        
    }
}

package Roblox;
import java.util.ArrayList;


public class FindPeaks {
 public static void main(String[] args) {
     int[] arr = {1, 4, 3, -1, 5, 5, 7, 4, 8};
     int n = arr.length;
     ArrayList<Integer> peaks = new ArrayList<Integer>();
     if(arr[0]>arr[1])
         peaks.add(0);
     for(int i=1;i<n-1;i++) {
         if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
             peaks.add(i);
     }
     if(arr[n-1]>arr[n-2])
         peaks.add(n-1);
     for(int i=0;i<peaks.size();i++)
         System.out.print(arr[peaks.get(i)]+" ");
 }
}
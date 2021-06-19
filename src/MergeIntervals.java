/*

# Merge all overlapping schedules into one and output the result which should have only mutually exclusive intervals.
#
# example:
#     Given:  [ [1,4], [6,8], [3,5], [7,9] ]
#     Result:  [ [1,5], [6,9] ]
#

schedule = [[1,4],[6,8],[3,5],[7,9]]

 */

import java.io.*;
        import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        arr[0][0] = 1;
        arr[0][1] = 4;
        arr[1][0] = 6;
        arr[1][1] = 8;
        arr[2][0] = 3;
        arr[2][1] = 5;
        arr[3][0] = 7;
        arr[3][1] = 9;


        List<int[]> result = findIntervals(arr);

        for(int[]a: result) {
            for(int i=0;i<a.length;i++) {
                System.out.print(a[i]+ " ");
                System.out.println();
            }

        }
    }

    public static List<int[]> findIntervals(int[][] arr) {

        LinkedList<int[]> result = new LinkedList<>();

        if(arr.length == 1 && arr[0].length == 1) {

            for(int[] curr:arr) {
                result.add(curr);
            }
            return result;
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        for(int[] currentInterval:arr) {
            if(result.isEmpty() || result.getLast()[1]<currentInterval[0]) {
                result.add(currentInterval);
            }
            else {
                result.getLast()[1] = Math.max(result.getLast()[1], currentInterval[1]);
            }
        }
        return result;
    }
}

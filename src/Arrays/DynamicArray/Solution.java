package Arrays.DynamicArray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        int q = in.nextInt();
        
        int lastAns = 0;
        
        int query, x, y;
        
        int[][] arr = new int[n][q];
        int[] arr_Q = new int[n];
        
        for(int i = 0; i < q; i++) {
        	arr_Q[i] = 0;
        }
        
        for(int i = 0; i < n; i++) {        	
        	query = in.nextInt();
        	x = in.nextInt();
        	y = in.nextInt();
        	
        	if(query == 1) {
        		arr[(x ^ lastAns) % n][arr_Q[(x ^ lastAns) % n]++] = y;
        	} else if(query == 2) {
        		lastAns = arr[(x ^ lastAns) % n][arr_Q[(x ^ lastAns) % n]++];
        		System.out.print(lastAns + " ");
        	}
        }
        
    } //end main
} //end class
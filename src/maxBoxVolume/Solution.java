package maxBoxVolume;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public int maxVol(int n){
		int l=0,b=0,h=0;
		int max = Integer.MIN_VALUE;
		int prod = Integer.MIN_VALUE;
		for(int i = n-1; i>1; i--){
			if (i%2 == 0){
				l=i/2;
				b=i/2;
				h = n - (l*2);
				prod = l*b*h;
				if (max<prod){
					max = prod;
				}
				
			}
		}
		return max; 
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // your code goes here
        Solution sol = new Solution();
        int vol = 0;
        vol = sol.maxVol(n);
        System.out.println(vol);
    }
}

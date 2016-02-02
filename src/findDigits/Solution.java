package findDigits;

import java.io.*;
import java.util.*;

public class Solution {

	static int is_even(int n){
		int temp = n, rem = 0, count = 0;
		while (temp!=0){
			rem = temp%10;
			temp = temp/10;
			if (rem!=0 && n%rem == 0){
				count++;
			}
		}
		return count;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int t,n,count;
    	Scanner scan = new Scanner(System.in);
    	t = scan.nextInt();
    	for (int i = 0; i<t; i++){
    		n = scan.nextInt();
    		count = is_even(n);
    		System.out.println(count);
    	}
    	scan.close();
    	
    }
}
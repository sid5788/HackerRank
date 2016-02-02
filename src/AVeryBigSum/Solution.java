package AVeryBigSum;

import java.io.*;
import java.util.*;

public class Solution {
static long sum = 0;
static long arr[] = new long[10];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner reader = new Scanner(System.in);
    	int length = 0;
    	length = reader.nextInt();
    	for (int i = 0; i<length; i++) {
    	    arr[i] = reader.nextLong();
    	    sum+=arr[i];
    	}
    	System.out.println(sum);
    }
}
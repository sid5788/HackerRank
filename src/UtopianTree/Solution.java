package UtopianTree;
import java.io.*;
import java.util.*;

public class Solution {
	static int T;
	static int N;
	static int uto_tree(int n){
	    int result = 1;
	   for (int i = 0; i<n; i++){
	       if (i%2 == 0){
	           result*=2;
	       }else{
	           result+=1;
	       }
	   }
	    return result;
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int result = 0;
    	Scanner scan = new Scanner(System.in);
    	T = scan.nextInt();
    	for (int i = 0; i<T; i++){
    		N = scan.nextInt();
    		result = uto_tree(N);
    		System.out.println(result); 
    	}
    	scan.close();
    }
}
package day5Loops;

import java.io.*;
import java.util.*;

public class Solution {
int T,a[],b[],N[];
Scanner scan;
public Solution(){
	scan = new Scanner(System.in);
    T = scan.nextInt();
    a = new int[T];
    b = new int[T];
    N = new int[T];
    for (int i = 0; i < T; i ++){
    	a[i]= scan.nextInt();
    	b[i] = scan.nextInt();
        N[i] = scan.nextInt();
    }
}

public void solveLoop(int a, int b, int N){
	int sum;
	for(int i = 1; i <= N; i++){
		sum = a;
		for (int j =0; j < i; j++){
			sum+= ((Math.pow(2.0, j))*b);
		}
		System.out.print(sum+" ");
	}
	System.out.print("\n");
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution sol = new Solution();
        for (int i =0; i< sol.T; i++){
        	sol.solveLoop(sol.a[i],sol.b[i],sol.N[i]);
        }
    }
}
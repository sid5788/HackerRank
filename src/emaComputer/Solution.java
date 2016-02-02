package emaComputer;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int N=0,M=0;
    	Scanner scan = new Scanner(System.in);
    	N=scan.nextInt();
    	M=scan.nextInt();
    	scan.nextLine();
    	String temp = null;
    	int sec = 0;//Second Largest plus
    	int first = 0;//Largest plus
    	char grid[][] = new char[N][M];
    	for (int i = 0; i<N; i++){
    		temp = scan.nextLine();
    		for (int j = 0; j<M; j++){
    			grid[i][j] = temp.charAt(j);
    		}
    	}
    	
    	for (int i = 0; i <N; i++){
    		for (int j = 0; j<M; j++){
    			
    		}
    	}
        /*
    	for (int i = 0; i<N; i++){
    		for (int j = 0; j<M; j++){
    			System.out.print(grid[i][j]);
    		}
    		System.out.println();
    	}*/
    }
}
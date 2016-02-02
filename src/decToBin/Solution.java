package decToBin;

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int T = scan.nextInt();
    	int dec, count = 0;
    	int bin[] = new int[100];
    	int i = 0;
    	for (i = 0; i<T; i++){
    	   dec = scan.nextInt();
    	   while(dec != 0){
    		   bin[count]= dec%2;
    		   dec/=2;
    		   count++;
    	   }
    	   
    	   for(i = count-1; i >= 0; i--){
       		System.out.print(bin[i]);
       	}
    	   count = 0;
       	   System.out.println();
    	}
    	
    	scan.close();
    }
}
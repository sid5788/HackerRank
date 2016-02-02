package flatLandSpaceStations;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int N,M;
    	int stations[];
    	int min_dist[];
    	Scanner scan = new Scanner(System.in);
    	N = scan.nextInt();
    	M = scan.nextInt();
    	int dist = Integer.MIN_VALUE;
    	int max_dist;
    	scan.nextLine();
    	min_dist = new int[N];
    	stations = new int[M];
    	for (int i = 0; i<M; i++){
    		stations[i]= scan.nextInt();
    	}
    	max_dist = Integer.MIN_VALUE;
    	for (int i = 0; i<N; i++){
    		min_dist[i]=Integer.MAX_VALUE;
    		for (int j = 0; j<M; j++){
    			dist = Math.abs(stations[j]-i);
    			if (dist<min_dist[i]){
    				min_dist[i]=dist;
    			}
    			
    		}
    		if (min_dist[i]>max_dist){
				max_dist = min_dist[i];
			}
    	}
    	System.out.println(max_dist);
    	
    }
}
package minDiffPair;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N, A[];
        int minDiff = Integer.MAX_VALUE;
        int diff;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        A = new int[N];
        for(int i = 0; i< N; i++){
            
            A[i]=scan.nextInt();
        }
        
        Arrays.sort(A);
        for (int i = 0; i <N-1; i++){
            diff = Math.abs(A[i]-A[i+1]);
            if (diff < minDiff){
                minDiff=diff;
            }
        }
        
        for (int i = 0; i<N-1; i++){
            if (Math.abs(A[i]-A[i+1]) == minDiff){
                System.out.print(A[i]+" "+A[i+1]+" ");
            }
        }
    }
}
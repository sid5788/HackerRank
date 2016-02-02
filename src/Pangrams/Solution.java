package Pangrams;
import java.io.*;
import java.util.*;

public class Solution {
static String s;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int len = 0, count = 0;
    	Scanner scan = new Scanner(System.in);
    	s = scan.nextLine();
    	len = s.length();
    	for (int i = 65; i<=90; i++){
    		for(int j=0; j<len;j++){
    			if(((int)(s.substring(j,j+1).toUpperCase().charAt(0))) == i){
    				count++;
    				break;
    			}
    		}
    	}
    	if (count == 26){
    		System.out.println("pangram");
    	}else{
    		System.out.println("not pangram");
    		
    	}
    	scan.close();
    }
}
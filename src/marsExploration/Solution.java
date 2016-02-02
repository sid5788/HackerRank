package marsExploration;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	int count = 0, cur = 0;
        Scanner in = new Scanner(System.in);
        String S = in.next();
        for(int i =0; i<S.length()/3; i++){
        	cur = 3*i;
        	if (S.charAt(cur) != 'S'){
        		count++;
        	}
        	if (S.charAt(cur+1) != 'O'){
        		count++;
        	}
        	if (S.charAt(cur+2) != 'S'){
        		count++;
        	}
        }
        System.out.println(count);
    }
}

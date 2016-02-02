package maxXOR;
//Sid: Test Case 10 -> Timed Out
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        long x,result;
        for(int a0 = 0; a0 < Q; a0++){
            long L = in.nextLong();
            long R = in.nextLong();
        
        x =0; 
        result = 0;
        for(long i = 0; i <=R; i++){
            x = x^i;
            if (i >=L){
                if (i == L){
                    result = x;
                }else{
                result = result^x;
                }
            }
        }
        System.out.println(result);
        }
    }
}

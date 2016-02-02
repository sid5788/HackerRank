package genNBitStrings;
import java.util.*;

class Solution{
	private char A[];
	private int n;
	public Solution(){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		A = new char[n];
		for (int i = 0; i<n; i++){
			A[i]=' ';
		}
	}
	
	public void digit(int n){
		if (n<1){
			for (int i = 0; i <this.n; i++){
				System.out.print(A[i]);
			}
			System.out.println();
		}else{
			A[n-1]='0';
			digit(n-1);
			A[n-1]='1';
			digit(n-1);
		}
		
	}
	public static void main (String []args){
		Solution sol = new Solution();
		sol.digit(sol.n);
	}
}
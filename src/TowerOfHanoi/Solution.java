package TowerOfHanoi;

import java.io.*;
import java.util.*;

public class Solution {
	int n;//No Of Discs
	int tower[][];
	
	public Solution(){
		n = 10;
		tower = new int[n][3];
		for(int i = 0; i < n; i++){
			tower[i][0] = i+1;
			tower[i][1] = 0;
			tower[i][2] = 0;
		}
	}
	
	public Solution(int n){
		this.n = n;
		tower = new int[n][3];
		for(int i = 0; i < n; i++){
			tower[i][0] = i+1;
			tower[i][1] = 0;
			tower[i][2] = 0;
		}
	}
	
	public void getTower(){
		for(int i = 0;i<n;i++){
			System.out.print(tower[i][0]+ " ");
			System.out.print(tower[i][1]+" ");
			System.out.println(tower[i][2]+" ");
		}
	}
	
	public void arrangeTower(int n, int frompeg, int topeg, int auxpeg){
		//PlaceHolder
		System.out.println("PlaceHolder");
		if (n ==1) {
			System.out.println("Move Disk 1 from peg" + frompeg + "to peg "+ topeg);
			
			return;
		}
		arrangeTower(n-1, frompeg,auxpeg,topeg);
		System.out.println("Move Disk "+n+" from peg" + frompeg + "to peg "+ topeg);
		arrangeTower(n-1, auxpeg, topeg, frompeg);
	}
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Solution sol = new Solution(n);
		//Move Tower Disks
		sol.arrangeTower(n,0,1,2);
		sol.getTower();
	}
}
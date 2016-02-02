package phoneBookHash;
import java.util.*;
import java.io.*;

class Solution{
	Map<String,Integer>phoneBook;
	public Solution(){
		phoneBook = new HashMap<String,Integer>();
	}
	
	public void insertEle(String name, int phone){
		phoneBook.put(name, phone);
	}
	
	public void displayMap(){
		System.out.println(phoneBook.keySet());
		System.out.println(phoneBook.values());
	}
	
	public void searchMap(String s){
		Object phone = 0;
		phone = phoneBook.get(s);
		if (phone != null){
			System.out.println(s+"="+phone);
		}else{
			System.out.println("Not found");
		}	
	}
	
   public static void main(String []args)
   {
	  Solution sol = new Solution();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         sol.insertEle(name, phone);
         in.nextLine();
      }
      System.out.println();
      while(in.hasNext())
      {
         String s=in.nextLine();
         sol.searchMap(s);
      }
      in.close();
   }
}

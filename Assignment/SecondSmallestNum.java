package week1.day2.Assignment;

import java.util.Arrays;

public class SecondSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= {2,3,6,8,9};
		int length=n.length;
		Arrays.sort(n);
	        for(int j=length-1;j>=0;j--) 
	        {
				System.out.println(n[j]);
			}
	        
			System.out.println("The Smallest value among the Arrylist is "+ n[length-4]);
	}

}
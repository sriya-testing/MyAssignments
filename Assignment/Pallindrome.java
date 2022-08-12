package week1.day2.Assignment;

public class Pallindrome {
	public static void main(String[] args) {
		int num=34343,temp,rev,rem;
		temp=num;
         for(rev=0;num>0;num=num/10)
		{
			rem=num%10;
		    rev=(rev*10)+rem;
		}
         
		if(rev==temp) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not a pallindrome");
		}
		
	}

}

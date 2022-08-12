package week1.day2.Assignment;

public class ConvertNegPosi {
	public static void main(String[] args) {
		int number=-42;
		if(number>0)
		{	
		System.out.println("It is a positive number");
		}
		else {
			System.out.println("It is a negative number");
			number=-(number);
			System.out.println("It is a converted number " +number);
		}
	}

}

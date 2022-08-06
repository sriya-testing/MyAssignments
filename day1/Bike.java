package week1.day1;

public class Bike  {

	  private void soundHorn() { 
		  System.out.println("sound horn1"); 
		  }
	  
	  private void applyBreak() { 
		  System.out.println("Applied Break1"); 
		  }
	
	public static void main(String[] args) {
		
		Car c= new Car();
		c.applyBreak();
		c.soundHorn();
	
		Bike b=new Bike();
		b.applyBreak();
		b.soundHorn();
	
	}

}

package codes;
import java.util.*;

class cylinder{
	//properties
	public double radius;
	
	public double height;
	//methods :-
	public double lidArea()
	{
		return Math.PI* radius *radius ;
	}
	
	public double circum() {
		
		return 2 * Math.PI *radius;
	}
	
	public double TotalSurfaceArea() {
		
		return 2* Math.PI * radius *(height+radius);
	}
	
	public double volume() {
		return Math.PI * radius *height;
	}
}

public class Cylinder1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		double a,b ;
		System.out.println("enter the value of radius:-");
		a = s.nextDouble();
		
		System.out.println("enter the value of height:-");
		b = s.nextDouble();
		
		cylinder c1= new cylinder();//object of class
		
		c1.radius =a;
		c1.height = b;
		
		System.out.println("the  lidArea is :- " + c1.lidArea());
		System.out.println("the  Circum is :- " + c1.circum());
		System.out.println("the  Volume is :- " + c1.volume());
		System.out.println("the  TSA is :- " + c1.TotalSurfaceArea());
		
		s.close();
	}

}

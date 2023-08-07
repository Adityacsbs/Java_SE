package codes;

class circle1{
	
	public double radius;//property of class
	
	public double area() //Methods of the class
	{
		 return Math.PI * radius *radius;
	}
	public double circum() {
		return 2*Math.PI*radius;
	}
	public double perimeter() {
		return circum();
	}
}

public class Circle {

	public static void main(String[] args) {
		
		circle1 c1=new circle1 ();//object hai yeah
		circle1 c2=new circle1 ();//2nd object of circle1 class we  can make multiple class
		c1.radius=7;//
		c2.radius =15 ;//yeah radius ki value hai jo assign kri hai 
		System.out.println("method 1 :-");
		System.out.println("Area is:-"+c1.area());
		System.out.println("Circum is :- "+c1.circum());
		System.out.println("perimeter is :- "+c1.perimeter());
		System.out.println("method 2 :-");
		System.out.println(c2.area());
		System.out.println(c2.circum());
		System.out.println("perimeter is :- "+c2.perimeter());
		
	}

}

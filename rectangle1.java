package codes;

class rectangle{
	
	public double length;//properties of class 
	public double breadth;
	
	
	public double area() //methods of class
	{
		return (length * breadth);
	}
	public double perimeter() {
		return 2*(length + breadth);
	}
	public boolean isSquare() {
		return length==breadth;
	}
}

public class rectangle1 {

	public static void main(String[] args) {
		
		rectangle r1=new rectangle();//object of class
        r1.length=10.3;
        r1.breadth =12;
        
        System.out.println("Area is :- "+ r1.area());
        System.out.println("perimeter is :-" + r1.perimeter());
        System.out.println("Is this square :- " + r1.isSquare());
	}

}

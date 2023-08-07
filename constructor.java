package codes;

class construct1{
	
	private double length;
	
	private double breadth;
	
	
	public double getLength() {// getter method
		return length ;
	}
	
	public double getBreadth() {// getter method
		return breadth;
	}
	
	public void setLength(double l) {// setter method
		if(l>0) {
			length = l;
		}else {
			length = 1;
		}
	}
	public  void setBreadth(double b) {
		if(b>0) {
			breadth = b;
		}
		else {
			breadth = 1;
		}
	}
	
	public construct1() { // by default constructor
		length = 5;
		breadth = 9;
	}
	
	/*public construct(double l, double b) {// in this value is given when object is created 
		length = l;
		breadth = b;
	}*/
	public construct1(double l, double b) {// in this value is given when object is created 
		setLength(l);
		setBreadth(b);
	}
	
	//public construct1(double s) {
	//	length = breadth = s;
//	}
	
	public construct1(double s ) {
		setLength(s);
		setBreadth(s);
	}
	
	
	public double area() {
		return length *breadth;
	}
	public double peri() {
		return 2*(length+breadth);
	}
	
	
}

public class constructor {

	public static void main(String[] args) {
		
		construct1 c =new construct1();
		
		System.out.println("area is :- " + c.area());

       construct1 c1 = new construct1(-5.3,3.3);
       System.out.println("area is :- " + c1.area());
       
       construct1 c3 =new construct1(-5);
		
		System.out.println("area is :- " + c3.area()+" this is square");
		System.out.println(c3.peri());
	}

}

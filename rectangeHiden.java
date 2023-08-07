package codes;

import java.util.*;
class rect{
	
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setLength(double l) {
		if(l>0) {
			length =l;
		}
		else {
			length =0;
		}
	}
	public void setBreadth(double b) {
		if(b>0) {
			breadth =b;
		}
		else {
			breadth =0;
		}
	}
	
	public double area() {
		return length *breadth;
	}
	
	public double perimeter() {
		return 2* length * breadth;
	}
	//constructor 
	public rect() {
		length =3;
		breadth =4;
	}
	
	public rect(double l, double b) {
		 length =l ;
		 breadth =b;
	}
}

public class rectangeHiden {

	public static void main(String[] args) {
		
		rect r=new rect();
		
		r.setLength(12);//setter method fro setting the hiden property value 
		r.setBreadth(12.3);
		
		
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
//getter method is usd to get the hidden information
		
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		
		
		Scanner n=new Scanner (System.in);
		
		double len,bre;
		System.out.println("enter the value of length ");
		len =n.nextDouble();
		System.out.println("enter the value of breadth ");
		bre = n.nextDouble();
		
		rect r1 = new rect();
		
		r1.setLength(len);
		r1.setBreadth(bre);
		
		System.out.println("Area is :- " + r1.area() );
		System.out.println("Area is :- " + r1.perimeter() );
		
		n.close();	
		rect r2= new rect();
		
		System.out.println(r2.area());
		System.out.println(r2.getLength());
		
        rect r3= new rect(12.4,12);//constructor ki value object create ho tabhi initilize kar do 
		
		System.out.println(r3.area());
		System.out.println(r3.getLength());
	}

}

package codes;
import java.util.*;

class Product1{
	
	private int itemNo =12 ;
	private String Name = "Manforce condom";
	private int price ;
	private int quantity ;
	
	public int getItemNo() {
		return itemNo;
	}
	public String getName() {
		return Name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int q) {
		if(q>0) {
			quantity = q;
		}else {
			quantity = 0;
		}
	}
	
	public Product1() {
		itemNo = 12;
		Name = "Manforce condom";
		price = 90;
		quantity = 1;
	}
	
	public Product1(int q) {
		itemNo = 12;
		Name = "Manforce condom";
		price = 90;
		setQuantity(q);
		
	}
	public String details() {
		return " \n Item no is " + itemNo +"\n name of product is " + Name + "\n price is :- " + price + "\n the quantity is " + quantity 
				+ " \n total price is :- " + (price*quantity);
	}
	
	
	
	
}

public class condom {

	public static void main(String[] args) {
		
		Product1 p = new Product1();
		
		System.out.println(" the product details are:- " + p.details());
		
	    System.out.println("\n");
	    
       
		
	    Product1 p1 = new Product1(15);
	
    	System.out.println(" the product details are:- " + p1.details());
    	
    	System.out.println("\n");
    	
        Product1 p2 = new Product1();
        
        p2.setQuantity(12);
		
		System.out.println(" the product details are:- " + p2.details());
		
	    System.out.println("\n");
	    
	    Scanner s = new Scanner(System.in);
	    
	    int quant;
	    System.out.println("enter the number of quantity product req. :- ");
	    quant = s.nextInt();	
	    
	    Product1 p3 = new Product1();
	    
	    p3.setQuantity(quant);
	    
	    System.out.println(p3.details());
	    s.close();
	}
}
	


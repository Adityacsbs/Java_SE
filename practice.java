package codes;

public class practice {
	
	//private static final String Final = null;

	public static void main(String[] args) {
		
		System.out.println("hello aditya");
		//if we use print in place of println then new line is not added 
		
		System.out.println(123);
		System.out.print("this will not change the  line ");
		System.out.print(" same line \n");
		
		//comment 
		/* multiple line comment*/
		/*
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false*/
		
		
		//final keyword used no one can overwrite your variable again
		
		final int a = 13;
		//a = 15; if ewe overwrite the value of 'a' this thing it will give error 
	    System.out.println(a);
	    
	    int myNum = 5;
	    float myFloatNum = 5.99f;
	    char myLetter = 'D';
	    boolean myBool = true;
	    String myText = "Hello";
	    
	    System.out.println(myNum);
	    System.out.println(myFloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
	    
	    int age =20;
	    
	    System.out.println("My age is "+ age);
	    
	    System.out.println(12*12*123*1231);
	    
	    int aw,we,qw;
	    
	    aw=we=qw=23;
	    
	    System.out.println(aw+we+qw);
	    
	    float f1 = 35e9f;
	    double d1 = 12E5d;
	    System.out.println(f1);
	    System.out.println(d1);
	    
	    boolean javaisgood = true;
	    boolean javaisbad = false;
	    
	    System.out.println(javaisgood);
	    System.out.println(javaisbad);
	    
	 // java type casting 
	 //Type casting is when you assign a value of one primitive data type to another type.
	    
	 // two types of casting:-  
	 //Widening Casting (automatically) - converting a smaller type to a larger type size
	 //Narrowing Casting (manually) - converting a larger type to a smaller size type
	  
	    //Widening Casting
	    int  h=92;
	    
	    double hd=h;// Automatic casting: int to double

	    System.out.println(h);
	    System.out.println(hd);
	    
	    //Narrowing Casting
	    
	    double q=12.12131d;
	    
	    int qq= (int) q;
	    
	    
	    System.out.println(q);
	    System.out.println(qq);
	    
	    
	    String txt ="askduqhdibkskjabf";
	    
	    System.out.println("the length of string is =" + txt.length());
	    
	    System.out.println(txt.indexOf('i'));
	    
	    System.out.println("postion of word \"q\" is :- " + txt.indexOf('q'));	    
	    
	    System.out.println((int)(Math.sqrt(9)));
	    
	    
	    System.out.println(Math.min(9,65));
        
	    System.out.println(Math.max(12,123));
	    
	    System.out.println(Math.abs(-12.1));
	    
	    //if we want to any random number than we use "Random" keyword 
	    //if we want from 1to 10 we have to multiply from 11
	    //from 1 to 100 then 101 etc.........
	    System.out.println((int)(Math.random()*1001));
	    System.out.println("The random number from 1 to 10 is :- " + (int)(Math.random()*11));
	    
	    
	    
	    
	    
	}
}
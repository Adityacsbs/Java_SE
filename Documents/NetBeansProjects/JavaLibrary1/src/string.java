
public class string {
    
    public static void main(String[] args){
        
        System.out.println("String yaha se start hua hai :");
        
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           
        System.out.println("size of text is :-" + txt.length());
        int n = txt.length();
        System.out.println(n);
        
         System.out.println(txt.toUpperCase());
         System.out.println(txt.toLowerCase());
       
         String s ="Aadityaraj Singh chouhan ";
         
         System.out.println(s.indexOf("Singh"));
         System.out.println(s.indexOf('c'));
         
         // concatenation
         
         String firstname ="aadityaraj";
         String middlename = "singh";
         String lastname ="chouhan";
         
         System.out.println((firstname+"."+middlename+"."+lastname).toUpperCase());
        System.out.println(firstname.concat(middlename+lastname).toUpperCase());
        System.out.println(firstname.concat(middlename+lastname).toLowerCase());
        
        //when string and number is used then ans is sring
        int oi =20;
        
        String h ="ad\nityaa\fsingh\tchouha\fnnn";
        
        System.out.println(oi+h);
        
    }
    
}

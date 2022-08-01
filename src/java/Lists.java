package java;
import java.util.Scanner;
import java.util.*;
import java.util.regex.*;
class Lists{
public static void main(String args[]) {
   String pswd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the password::");
   
    
   // String arr[8]=  pswd = sc.nextLine();
    
    ArrayList <String> ls = new ArrayList<String>();
    
    ls.add( pswd = sc.nextLine());
    
    Pattern p = Pattern.compile("(\\w{7})(\\W{1})");
    Matcher m = p.matcher(pswd);
    boolean b = m.matches();
    
    try
    {

    
        if(pswd.length() == 8 )
        
            System.out.println("your password is ok:");
            
        
        /*else
        {
        
        System.out.println("your password is not_ok");
        }*/
    }
    catch(StringIndexOutOfBoundsException e){
        System.out.println(e);
        
    }
    
}
}

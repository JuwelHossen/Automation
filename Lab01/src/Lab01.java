
import java.util.*;
public class InfoOf3{
public static void main (String [] args)
{

   int a=0,b=0,c=0;
   boolean j,k,l,m,n,o,p;
   
   Scanner keyboard = new Scanner (System.in);

   System.out.print("first number?");
   a=keyboard.nextInt();
   System.out.println();
   
   System.out.print("second number?");
   b=keyboard.nextInt();
   System.out.println();
   System.out.print("third number?");
   c=keyboard.nextInt();
   System.out.println();
   
   j = allAreEqual(a,b,c);
   System.out.println("allAreEqual: "+j);
   
   k=twoAreEqual(a,b,c);
   System.out.println("twoAreEqual: "+k);
   
   l= noneAreEqual(a,b,c);
   System.out.println("noneAreEqual: "+l);
   
   m=areAscending(a,b,c);
   System.out.println("areAscending: "+m);
   
   n=areDescending(a,b,c);
   System.out.println("areDescending: "+n);
   
   o=strictlyAscending(a,b,c);
   System.out.println("strictlyAscending: "+o);
   
   p=strictlyDescending(a,b,c);
   System.out.println("strictlyDescending: "+p);
/*
boolean allAreEqual(int a, int b, int c);
boolean twoAreEqual(int a, int b, int c); // false if all three are equal
boolean noneAreEqual(int a, int b, int c);
boolean areAscending(int a, int b, int c); // true if a <= b <= c
boolean areDescending(int a, int b, int c); // true if a >= b >= c
boolean strictlyAscending(int a, int b, int c); // true if a < b < c
boolean strictlyDescending(int a, int b, int c); // true if a > b > c
*/
}
public static boolean allAreEqual(int a, int b, int c)
{
  boolean bool = false;
  if( a==b && b==c)
  {
   bool=true;
  }
  return bool;
}

//;;;;;;;;;;;;;;;;;;;

public static boolean twoAreEqual(int a, int b, int c)
   {
     boolean bool = false ;
     if ((a ==b && b !=c) || (b== c && c!=a))
     bool=true;
     
     return bool;
     
     
   }
   
   //.................................
 public static boolean noneAreEqual(int a, int b, int c)
   {
     boolean bool = false ;
     
     if (a !=b && b !=c) 
     bool=true;
     
     return bool;
     
   }
   //..............
   
  public static  boolean areAscending(int a, int b, int c)
  {
    boolean bool = false ;
     
     if (a<=b && b<=c) 
     bool=true;
     
     return bool;
    
  }
  
 //..................
  
   public static boolean areDescending(int a, int b, int c)
   {
      boolean bool = false ;
     
     if (a>=b && b>=c) 
     bool=true;
     
     return bool;
   }
   
   //............
  public static  boolean strictlyAscending(int a, int b, int c)
   {
   boolean bool = false ;
     
     if (a<b && b<c) 
     bool=true;
     
     return bool;
   }
   
   
   //........
 public static boolean strictlyDescending(int a, int b, int c)
 {
    boolean bool = false ;
     
     if (a>b && b>c) 
     bool=true;
     
     return bool;
 }
   
}

package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


        int num, prev=0,next=1,fib=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci number you want : ");
        num = in.nextInt();
        System.out.println("Fibonacci: "+ prev );
        System.out.println("Fibonacci: "+ next );
        for(int i=1;i<=num-2;i++)
        {
            fib=prev+next;

            System.out.println("Fibonacci: "+ fib );
            prev= next;
            next=fib;


        }


    }


}

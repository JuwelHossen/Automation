package math.problems;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
          int layer,i,j,k;
           Scanner input = new Scanner(System.in);
           System.out.println("How many layer you want");
           layer=input.nextInt();

           for(i=1;i<=layer;i++)

           {
               for(j=i;j<layer;j++)
               {
                   System.out.print(" ");
               }
               for(k=1;k<(i*2);k++)
               {
                   System.out.print("*");
               }
               System.out.println();
           }


        }
  }

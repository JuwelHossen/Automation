package math.problems;

import algorithm.Sort;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};




        Sort sort = new Sort();
        sort.mergeSort(array1,0,array1.length-1);

        System.out.println("Array 1:");
         for(int i=0;i<array1.length;i++)
         {
            System.out.print(" "+array1[i]);
         }

        System.out.println();
        sort.mergeSort(array2,0,array2.length-1);

        System.out.println("Array 2:");
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(" "+array2[i]);
        }

        System.out.println();
        int lowest=findLowest(array1,array2,array1.length,array2.length);

        System.out.println("The lowest difference of two array is: "+lowest);




    }

    // find lowest
    static int findLowest(int A[], int B[], int m, int n)
    {

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            // Move Smaller Value
            if (A[a] < B[b])
                a++;

            else
                b++;
        }

        // return final sma result
        return result;
    }



}

package math.problems;

import org.testng.Assert;
import string.problems.Anagram;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


//lowest number in array
        int [] a ={1,3,5,4,5};// s
        Assert.assertEquals(1, LowestNumber.minValue(a));


        int [] b ={1,3,5,4,2};//sum=15
        Assert.assertEquals(15, FindMissingNumber.sumOfArray(b));


    }
}

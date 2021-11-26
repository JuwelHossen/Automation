package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employeeInfo = new EmployeeInfo("xxx",12);
        Assert.assertEquals(12,employeeInfo.employeeId());

    }
}

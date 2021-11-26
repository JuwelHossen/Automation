package design;

import java.util.Scanner;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws NullPointerException
	{



       //default constructor
		EmployeeInfo  employeeInfo0= 	new EmployeeInfo();
		EmployeeInfo  employeeInfo = 	new EmployeeInfo("*** BIG DREAM ***");



		EmployeeInfo  emp1 = new EmployeeInfo("RANA",1,"HR","MANAGER",10);
		EmployeeInfo  emp2 = new EmployeeInfo("SOJOL",2,"FINANCE","CEO",24);
		EmployeeInfo  emp3 = new EmployeeInfo("ARIFUL",3,"MARKETING","LEAD MANAGER",2);

		// Printing Employee information in this pattern
		//"Name     ID Number     Department      Position     Years Worked      Pension      Bonus      Total salary   "

		System.out.println(emp1.employeeName()+"      "+emp1.employeeId()+"             "+emp1.getDepartment()+"              "+
							emp1.getPosition()+"          "+emp1.getYearsWorked()+"               "+emp1.calculateEmployeePension()
							+"       "+emp1.calculateEmployeeBonus()+"          "+emp1.calculateSalary());


		System.out.println(emp2.employeeName()+"     "+emp2.employeeId()+"             "+emp2.getDepartment()+"         "+
				emp2.getPosition()+"               "+emp2.getYearsWorked()+"               "+emp2.calculateEmployeePension()
				+"       "+emp2.calculateEmployeeBonus()+"          "+emp2.calculateSalary());


		System.out.println(emp3.employeeName()+"    "+emp3.employeeId()+"             "+emp3.getDepartment()+"       "+
				emp3.getPosition()+"      "+emp3.getYearsWorked()+"              "+emp3.calculateEmployeePension()
				+"      "+emp3.calculateEmployeeBonus()+"          "+emp3.calculateSalary()+"\n");



		//inheritance super keyword and method overloading and overriding

          PartTimeEmployee partTimeEmployee= new PartTimeEmployee("HABIB",28);

		System.out.println("  PART TIME EMPLOYEE NAME : "+partTimeEmployee.employeeName());
		System.out.println("  PART TIME EMPLOYEE ID   : "+partTimeEmployee.employeeId());
		System.out.println(  partTimeEmployee.calculateEmployeeBonus());









	}

}

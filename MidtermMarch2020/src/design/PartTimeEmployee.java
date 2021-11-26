package design;

public class PartTimeEmployee extends EmployeeInfo

{

    String name =" ";
    int   idPart;

    public PartTimeEmployee (String s,int n)
    {
        super();
        super.name=s;
        super.employeeID=n;
        System.out.println("\t\t\t\tPart time information:");
    }


    //overriding  methods
   public  double calculateEmployeeBonus()
   {
       System.out.print("\n\tPart time employee bonus is nothing :");
        return  0.0;
   }

    //overloading methods
    public void display(String name)
    {

        System.out.println("Part Time Employee:"+ name);

    }


}

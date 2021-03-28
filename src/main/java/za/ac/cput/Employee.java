package za.ac.cput;


/*
    Author: Akhona Mngqibisa (217302394)
    Date: 28 March 2021
    Employee.java
 */
public class Employee
{
    private String fullName;
    private String position;
    private double salary;

    //Constructor
    Employee()
    {
        this.fullName= fullName;
        this.position= position;
        this.salary= salary;
    }
    Employee(String fullName, String position, double salary)
    {
        this.fullName= fullName;
        this.position= position;
        this.salary= salary;
    }


    //Setters
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    public void setSalary(int hours) {
        if(hours>= 45) {
           salary = 2000 * 4;
        }

        else {
             salary = 1500 * 4;
        }
    }

    //Getters
    public String getFullName()
    {
        return fullName;
    }
    public String getPosition()
    {
        return position;
    }
    public double getSalary()//weekly hours
    {
             return salary ;
    }
    //ToString
    public String toString()
    {
        return "Full Name: "+getFullName()+" \nPosition: "+getPosition()+ "\nSalary: R"+getSalary();
    }

    /*
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setFullName("Akhona Mngqibisa");
        emp1.setPosition("Manager");
        emp1.setSalary(40);
        System.out.println(emp1.toString());
         }

     */
}

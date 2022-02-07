/*4. Write two Java classes Employee and Engineer. Engineer should inherit from
Employee class. Employee class to have two methods display() and calcSalary().
Write a program to display the engineer salary and to display from Employee class
using a single object instantiation (i.e., only one object creation is allowed).
a. display() only prints the name of the class and does not return any value. Ex. “
Name of class is Employee.”
b. calcSalary() in Employee displays “Salary of employee is 10000” and
calcSalary() in Engineer displays “Salary of employee is 20000.”*/

import java.util.*;

class Employee
{

    void display()
    {

         System.out.println("Name of class is Employee.");

    }

  public void calcSalary()
    {
        System.out.println("Salary of Employee is 10000");
    }

}

class Engineer extends Employee
{

    void calcSalary()
    {
        System.out.println("Salary of Engineer is 20000");
    }

}
public class Employees
{

     public static void main(String args[])
     {

     Engineer e = new Engineer();
     e.display();
     e.calcSalary();

     }

}

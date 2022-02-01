/*1. Write a Java program which creates a class named 'Employee' having the following
members: Name, Age, Phone number, Address, Salary. It also has a method named
'print-Salary( )' which prints the salary of the Employee. Two classes 'Officer' and
'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data
members 'specialization' and 'department' respectively. Now, assign name, age, phone
number, address and salary to an officer and a manager by making an object of both
of these classes and print the same.*/

import java.util.*;

public class employee
{
    String name,address;
    int age,phoneno,salary;
    
    
    void printsalary()
     {
        System.out.println(salary); 
     }
  
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    officer o=new officer();
    Manager m=new Manager();
    
    o.input();
    System.out.print("specialization:");
    o.specialization=obj.nextLine();
    
    m.input();
    System.out.print("Department:");
    m.Department=obj.nextLine();
   
   o.display();
    System.out.println("SPECIALIZATION: "+o.specialization);
   
   m.display();
    System.out.println("DEPARTMENT: "+m.Department);
    
   }
  
  void input()
  { 
    Scanner obj1=new Scanner(System.in);
   
   System.out.print("Name:");
    name=obj1.nextLine();
   
   System.out.print("age:");
    age=obj1.nextInt();
   
   System.out.print("Salary:");
    salary=obj1.nextInt();
   
   System.out.print("Address:");
    address=obj1.next();
   
   System.out.print("Phone no:");
    phoneno=obj1.nextInt();
     
  }
  void display()
  {
    System.out.println("NAME: "+name);
    System.out.println("AGE: "+age);
    System.out.println("SALARY: "+salary);
    System.out.println("ADDRESS: "+address);
    System.out.println("PHONENO: "+phoneno);

}
  
     
    
    
}

  class officer extends employee
    {
       String specialization;
    }
 
 class Manager extends employee
    {
      String  Department;
    }

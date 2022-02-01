/*2. Write a java program to create an abstract class named Shape that contains an empty
method named numberOfSides( ). Provide three classes named Rectangle, Triangle
and Hexagon such that each one of the classes extends the class Shape. Each one of
the classes contains only the method numberOfSides( ) that shows the number of
sides in the given geometrical structures.*/

import java.util.*;
 abstract class Shape
{
    
     void Numberofsides()
     {}
   
}

 class Rectangle extends Shape
 {
     void Numberofsides()
     {
         System.out.println("The side of Rectangle:4");
     }
 }
 

class Triangle extends Shape
 {
      void Numberofsides()
     {
         System.out.println("The side of Triangle:3");
     }
 }
 

class Hexagon extends Shape
 {
     void Numberofsides()
     {
         System.out.println("The side of Hexagon:6");
     } 
 }
 
public class shape
 {
     public static void main(String args[])
     {
       
       Rectangle r = new Rectangle();
       Triangle t = new Triangle();
       Hexagon h = new Hexagon();
          r.Numberofsides();
          t.Numberofsides();
          h.Numberofsides();
   
     }
}

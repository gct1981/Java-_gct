//Java Program to demonstrate the use of static variable  
class Student
{  
   int rollno;//instance variable  
   String name;  
   static String college ="Birla College";//static variable  
   //constructor  
   Student(int r, String n)
   {  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display()
   {
     System.out.println(rollno+" "+name+" "+college);
   }  
}  
//Test class to show the values of objects  
public class TestStaticVariable1
{  
 public static void main(String args[])
 {  
 Student s1 = new Student(111,"Karan");  
 Student s2 = new Student(222,"Aryan");  
 //we can change the college of all objects by the single line of code  
 //Student.college="Agrawal College";  if the variable is static then you can change it with class name directly.
 s1.display();  
 s2.display();  
 }  
}  


/**
 * Write a description of class UnitFiveBQ8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFiveBQ8
{
    /* Consider the following class declaration.

public class Student

{

private String firstName;

private String lastName;

private int age;

public Student(String firstName, String lastName, int age)

{

firstName = firstName;

lastName = lastName;

age = age;

}

public String toString()

{

return firstName + " " + lastName;

}

}

The following code segment appears in a method in a class other than Student. 
It is intended to create a Student object and then to print the first name and last name associated with that object.

Student s = new Student("Priya", "Banerjee", -1);

System.out.println(s);

Which of the following best explains why the code segment does not work as expected? */

    public static void main(String[] args){
        Student s = new Student("Priya", "Banerjee", -1);
        System.out.println(s);
        //when you run this code, it returns 'null null' because the constructor only interacted with the local variables passed into the constructor.
    }
    
    //Key Point that I missed on this question was that Constructors are also a type of method in Java. Thus, the variables inside of a Constructor are LOCAL variables.
    //and NOT INSTANCE variables.
}


/**
 * Write a description of class UnitFiveBQ11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFiveBQ11
{
    /*Consider the following class definition.

public class Person
{
private String name;
private int feet;
private int inches;
public Person(String nm, int ft, int in)
{
name = nm;
feet = ft;
inches = in;
}
public int heightInInches()
{
return feet * 12 + inches;
}
public String getName()
{
return name;
}
public String compareHeights(person other)
{
if (this.heightInInches() < other.heightInInches())
{
return name;
}
else if (this.heightInInches() > other.heightInInches())
{
return other.getName();
}
else return "Same"
}
}

The following code segment appears in a method in a class other than Person.
    Person andy = new Person("Andrew", 5, 6);
    Person ben = new Person("Benjamin", 6, 5);
    System.out.println(andy.compareHeights(ben));
What, if anything, is printed as a result of executing the code segment? */

public static void main(String[] args){
    Person andy = new Person("Andrew", 5, 6);
    Person ben = new Person("Benjamin", 6, 5);
    System.out.println(andy.compareHeights(ben));
}
}

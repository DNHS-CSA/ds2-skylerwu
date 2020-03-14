
/**
 * Write a description of class UnitFiveAQ5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFiveAQ5
{
    /*Consider the following class definition. 
     * Each object of the class Employee will store the employee’s name as name,   
     * the number of weekly hours worked as wk_hours,and hourly rate of pay as pay_rate.

     * public class Employee
{
private String name;
private int wk_hours;
private double pay_rate;

public Employee(String nm, int hrs, double rt)
{
name = nm;
wk_hours = hrs;
pay_rate = rt;
}
public Employee(String nm, double rt)
{
name = nm;
wk_hours = 20;
pay_rate = rt;
}
}

Which of the following code segments, found in a class other than Employee,
could be used to correctly create an Employee object representing an employee who worked for 20 hours at a rate of $18.50 per hour?

I.
Employee e1 = new Employee("Lili", 20, 18.5);
II.
Employee e2 = new Employee("Steve", 18.5);
III.
Employee e3 = new Employee("Carol", 20); */

            public static void main(String[] args){
             Employee e1 = new Employee("Lili",20,18.5);
             Employee e2 = new Employee("Steve",18.5);
             Employee e3 = new Employee("Carol",20);
             System.out.println(e1.name + " worked for " + e1.wk_hours + " hours at a rate of " + "$" + e1.pay_rate + " per hour.");
             System.out.println(e2.name + " worked for " + e2.wk_hours + " hours at a rate of " + "$" + e2.pay_rate + " per hour.");
             System.out.println(e3.name + " worked for " + e3.wk_hours + " hours at a rate of " + "$" + e3.pay_rate + " per hour.");
            }
}

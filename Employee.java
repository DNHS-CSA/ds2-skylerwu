public class Employee
{
String name;
int wk_hours;
double pay_rate;
//changed these variables to public to make it easier to display. In actual code, would use getter methods.

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
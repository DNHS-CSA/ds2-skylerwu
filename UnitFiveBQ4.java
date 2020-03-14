
/**
 * Write a description of class UnitFiveBQ4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFiveBQ4
{
    /* Consider the following class definition.

public class Gadget
{
static int status = 0;
*made it public for ease of access. Would use getter in real case.
public Gadget()
{
status = 10;
}

public static void setStatus(int s)
{
status = s;
}

}

The following code segment appears in a method in a class other than Gadget.

Gadget a = new Gadget();
Gadget.setStatus(3);
Gadget b = new Gadget();
Which of the following best describes the behavior of the code segment? */

public static void main(String[] args){
    Gadget a = new Gadget();
    System.out.println("After the command of 'Gadget a = new Gadget()', Gadget.status has a value of " + Gadget.status);
    System.out.println("After the command of 'Gadget a = new Gadget()', a.status has a value of " + a.status);
    Gadget.setStatus(3);
    System.out.println("After the command of 'Gadget.setStatus3', Gadget.status has a value of " + Gadget.status);
    System.out.println("After the command of 'Gadget.setStatus3', a.status has a value of " + a.status);
    Gadget b = new Gadget();
    System.out.println("After the command of 'Gadget b = new Gadget()', Gadget.status has a value of " + Gadget.status);
    System.out.println("After the command of 'Gadget b = new Gadget()', a.status has a value of " + Gadget.status);
    System.out.println("After the command of 'Gadget b = new Gadget()', b.status has a value of " + Gadget.status);
}
}

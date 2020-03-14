
/**
 * Write a description of class UnitFiveBQ3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFiveBQ3
{
    /*Consider the following class definition.

public class BoolTest
{
private int one;

public BoolTest(int newOne)
{
one = newOne;
}
public int getOne()
{
return one;
}
public boolean isGreater(BoolTest other)
{
(missing code)
}

}

The isGreater method is intended to return true if the value of one for this BoolTest object is greater than the value of one for the BoolTest parameter other,
and false otherwise. The following code segments have been proposed to replace (missing code).

return one > other.one;
return one > other.getOne();
return getOne() > other.one;
Which of the following replacements for (missing code) can be used so that isGreater will work as intended? */

public static void main(String[] args){
    BoolTest alpha = new BoolTest(0);
    BoolTest beta = new BoolTest(1);
    
    System.out.println(alpha.isGreaterOne(beta));
    System.out.println(alpha.isGreaterTwo(beta));
    System.out.println(alpha.isGreaterThree(beta));
}
}

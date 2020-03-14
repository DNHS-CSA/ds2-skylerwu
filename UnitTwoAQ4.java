
/**
 * Write a description of class UnitTwoAQ4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTwoAQ4
{
    /*Consider the following class declaration.

public class Thing
{
String color;
    public Thing()
    {
        color = "Blue";
    }
public Thing(String setColor)
    {
        color = setColor;
    }
}
Which of the following code segments, when appearing in a class other than Thing, would create a reference of type Thing with a value of null ? */
    
    public static void main(String[] args){
        Thing someThing = new Thing("Green");
        System.out.println(someThing.color);
        //doesn't work because sets color to green. not null.
        Thing someThing1 = new Thing("");
        System.out.println(someThing1.color);
        //doesn't work because sets color to empty String, which is NOT the same as null.
        Thing someThing2 = new Thing();
        System.out.println(someThing2.color);
        //doesn't work because sets color to "Blue" using the default constructor. NOT null.
        Thing someThing3;
        //System.out.println(someThing3.color);
        //DOES WORK because this is only the reference, and we didn't instantiate.
        //Thing("Green");
        //DOES NOT WORK because Thing is not a method. returns error as well that doesn't allow compile!
    }
}

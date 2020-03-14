
/**
 * Write a description of class UnitThreeQ21 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQ21
{
    /* Consider the following code segment.

     *String first = new String("duck");
     *String second = new String("duck");
     *String third = new String("goose");
     *
     *  if (first == second)
     *  {
     *      System.out.print("A");
     *  }
     *  else if (second == third)
     *  {
     *      System.out.print("B");
     *  }
     *  else if (first.equals(second))
     *  {
     *      System.out.print("C");
     *  }
     *  else if (second.equals(third))
     *  {
     *      System.out.print("D");
     *  }   
     *  else
     *  {
     *      System.out.print("E");
     *  }

What is printed as a result of executing the code segment? */
        
        public static void main(String[] args){
         String first = new String("duck");
         String second = new String("duck");
         String third = new String("goose");
     
       if (first == second)
       {
            System.out.print("A");
       }
       else if (second == third)
       {
           System.out.print("B");
       }
       else if (first.equals(second))
       {
           System.out.print("C");
       }
       else if (second.equals(third))
       {
           System.out.print("D");
       }   
       else
       {
           System.out.print("E");
       }   
        }

}

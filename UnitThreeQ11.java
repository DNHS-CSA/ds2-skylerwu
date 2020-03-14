
/**
 * Write a description of class UnitThreeQ11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQ11
{
    /* Consider the following two code segments. 
     * Assume that variables x and y have been declared as int variables and have been assigned integer values.

     * I.
     * int result = 0;
     * if (x > y)
     * {
     *     result = x - y;
     *     System.out.print(result);
     *  }
     *  else if (x < y)
     *  {
     *      result = y - x;
     *      System.out.print(result);
     *  }
     *  else
     *  {
     *      System.out.print(result);
     *  }

     *  II.
     *  if (x < y)
     *  {
     *      System.out.print(y - x);
     *  }
     *  else
     *  {
     *      System.out.print(x - y);
     *  }

     *  Which of the following correctly compares the outputs of the two code segments? */
     
     public static void main(String[] args){
         if(testOne(1,1)==testTwo(1,1)){
             System.out.println(true);
            }
         if(testOne(0,1)==testTwo(0,1)){
             System.out.println(true);
            }
         if(testOne(1,0)==testTwo(1,0)){
             System.out.println(true);
            }
        }
        
     public static int testOne(int x, int y){
         int result = 0;
     if (x > y)
      {
        result = x - y;
          return result;
       }
       else if (x < y)
       {
           result = y - x;
           return result;
       }
       else
       {
           return result;
       }
        }
        
     public static int testTwo(int x, int y){
         if (x < y)
      {
           return(y - x);
       }
       else
       {
           return(x - y);
       }
        }
}

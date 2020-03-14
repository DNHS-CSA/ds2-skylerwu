
/**
 * Write a description of class UnitTwoBQ11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTwoBQ11
{
    /* The code segment below is intended to randomly print one of the values 2, 4, 6, or 8 with equal probability.
     * int val =  (missing code);
     * val *= 2;
     * System.out.print(val);
     * Which of the following can be used to replace (missing code)so that the code segment works as intended? */
     
    public static void main(String[] args){
        int val = (int) (Math.random()*4 + 1);
        val *= 2;
        System.out.print(val);   
    }
}

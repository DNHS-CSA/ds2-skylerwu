
/**
 * Write a description of class UnitThreeQ16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQ16
{
    /*In the following expression, j, k, and m are properly declared and initialized int variables.
     * !((j == k) && (k > m))
     * Which of the following is equivalent to the expression above?*/
    
    public static void main(String[] args)
    {
        //tested out multiple configurations of j, k, m --> still returns true.
        
        int j = 0;
        int k = 0;
        int m = 0;
        
        if((!((j == k) && (k > m)))==((j != k) || (k <= m))){
            System.out.println("true");
        }
    
        int a = 0;
        int b = 1;
        int c = 2;
        
        if((!((a == b) && (b > c)))==((a != b) || (b <= c))){
            System.out.println("true");
        }
        
        int d = 0;
        int e = 0;
        int f = 1;
        
        if((!((d == e) && (e > f)))==((d != e) || (e <= f))){
            System.out.println("true");
        }
    }
}

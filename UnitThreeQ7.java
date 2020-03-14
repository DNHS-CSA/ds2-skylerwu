
/**
 * Write a description of class UnitThreeQ7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThreeQ7
{
    /*
     * 
     * In the code segment below, the int variable temp represents a temperature in degrees Fahrenheit. 
     * The code segment is intended to print a string based on the value of temp. 
     * The following table shows the string that should be printed for different temperature ranges.
     * 
    String weather;
    if (temp <= 31)
    {
        weather = "cold";
    }
    else
    {
        weather = "cool";
    }
    if (temp >= 51)
    {
        weather = "moderate";
    }
    else
    {
        weather = "warm";
    }
    System.out.println(weather);
   } 
        Which of the following test cases can be used to show that the code does NOT work as intended?
        temp = 30
        temp = 51
        temp = 60
   */
    
    
    public static void main(String[] args){
        System.out.println(returnWeather(30));
        System.out.println(returnWeather(51));
        System.out.println(returnWeather(60));
     
    }
    
    public static String returnWeather(int temp){
    String weather;
    if (temp <= 31)
    {
        weather = "cold";
    }
    else
    {
        weather = "cool";
    }
    if (temp >= 51)
    {
        weather = "moderate";
    }
    else
    {
        weather = "warm";
    }
    return weather;
   }
}

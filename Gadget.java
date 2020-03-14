public class Gadget
{
static int status = 0;
//made it public here. In reality, would keep private and use a getter method.

public Gadget()
{
status = 10;
}

public static void setStatus(int s)
{
status = s;
}

}
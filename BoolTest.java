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
public boolean isGreaterOne(BoolTest other)
{
return one > other.one;
}
public boolean isGreaterTwo(BoolTest other)
{
return one > other.getOne();    
}
public boolean isGreaterThree(BoolTest other)
{
return getOne() > other.one;   
}

}
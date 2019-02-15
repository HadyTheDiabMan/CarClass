/**
 * 
 * @author hdiab22, Car Class.
 *
 */
public class CarClass 
{
private int yearModel; //self explanatory
private String make; //company
private int speed; //current car speed

public CarClass(int year1, String make1)
{
	yearModel=year1;
	make=make1;
	speed=0;
}

public int getYearModel()
{
	return yearModel;
}

public String getMake()
{
	return make;
}

public int getSpeed()
{
	return speed;
}

public void accelerate()
{
	speed=speed+5;
}

public void brake()
{
	speed=speed-5;
}

}

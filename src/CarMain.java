/**
 * 
 * @author hdiab22
 *
 */
public class CarMain 
{

	public static void main(String[] args) 
	{
		CarClass Car= new CarClass(2016, "Buick");
		
		System.out.println(Car.getSpeed());
		Car.accelerate();
		System.out.println(Car.getSpeed());
		Car.accelerate();
		System.out.println(Car.getSpeed());
		Car.accelerate();
		System.out.println(Car.getSpeed());
		Car.accelerate();
		System.out.println(Car.getSpeed());
		Car.accelerate();
		System.out.println(Car.getSpeed());
		
		
		Car.brake();
		System.out.println(Car.getSpeed());
		Car.brake();
		System.out.println(Car.getSpeed());
		Car.brake();
		System.out.println(Car.getSpeed());
		Car.brake();
		System.out.println(Car.getSpeed());
		Car.brake();
		System.out.println(Car.getSpeed());
	}

}

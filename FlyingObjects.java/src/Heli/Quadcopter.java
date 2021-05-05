package Heli;
import air.Airplane;

public class Quadcopter extends Helicopter { //The extends keyword is used to allow java to know that Airplane is a descendant of FlyingObject

private int maxFlyingSpeed;

/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 */
public Quadcopter()
{
	maxFlyingSpeed=0;
}

/**Parameterized constructor: method that initializes the newly created object.
 * 
 * @param brand: This String, sets the brand name of the quadcopter
 * @param price: This double, sets the price of the quadcopter
 * @param horsePower: This integer, sets the horspower of the quadcopter
 * @param noCylinder: This integer, sets the number of cylinder of the quadcopter
 * @param creationYear: This integer, sets the year of creation of the quadcopter
 * @param passengerCapacity: This integer, sets the passenger capacity of the quadcopter
 * @param maxFlyingSpeed: This integer, sets the max flying speed of the quadcopter
 */
public Quadcopter(String brand,double price,int horsePower,int noCylinder,int creationYear,int passengerCapacity,int maxFlyingSpeed)
{

    super(brand,price,horsePower,noCylinder,creationYear,passengerCapacity);
	setMaxFlyingSpeed(maxFlyingSpeed);
}

/** copy constructor: creates an object by initializing it with an object of the same class.
 * 
 * @param quadcopter
 */
public Quadcopter(Quadcopter quadcopter)
{
this.maxFlyingSpeed=quadcopter.maxFlyingSpeed;
}

/** Retrieves the max flying capacity
 * 
 * @return: an integer of max flying speed.
 */
public int getMaxFlyingSpeed()
{
	return maxFlyingSpeed;
}

/**
 * 
 * @param maxFlyingSpeed: sets the max flying capacity coming from the driver.
 */
public void setMaxFlyingSpeed(int maxFlyingSpeed)
{
	this.maxFlyingSpeed=maxFlyingSpeed;
}

/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherQuadrocopter
 * @return: A boolean, true if both objects share the same max flying speed or else false.
 */
public boolean isEquals(Quadcopter anotherQuadrocopter)
{
return anotherQuadrocopter.getMaxFlyingSpeed() == this.getMaxFlyingSpeed();
}

/** The toString method is a method prints out the content of an object
 * 
 * @return: A String holding content of MaxFlyingSpeed.
 */
public String toString() {

	if(type == null)
		type = " Quadcopter ";
	
		 return (super.toString() + "It has a max flying speed of " + getMaxFlyingSpeed() + "mph.");

}
}

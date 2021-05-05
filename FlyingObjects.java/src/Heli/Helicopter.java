package Heli;
import air.Airplane;

public class Helicopter extends Airplane {

private int noCylinders;
private int creationYear;
private int passengerCapacity;

/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 */
public Helicopter()
{
	noCylinders=0;
	creationYear=0;
	passengerCapacity=0;
}


/**Parameterized constructor: method that initializes the newly created object.
 * 
 *The super keyword is used to call upon parent class.
* @param brand: This String, sets the brand name of the Multirotor
 * @param price: This double, sets the price of the Multirotor
 * @param horsePower: This integer, sets the horspower of the Multirotor
 * @param noCylinder: This integer, sets the number of cylinder of the Multirotor
 * @param creationYear: This integer, sets the year of creation of the Multirotor
 * @param passengerCapacity: This integer, sets the passenger capacity of the Multirotor
 * 
 */
public Helicopter(String brand, double price, int horsePower, int noCylinders, int creationYear , int passengerCapacity)
{

    super(brand,price,horsePower);
	setNoCylinders(noCylinders);
	setCreationYear(creationYear);
	setPassengerCapacity(passengerCapacity);
}

/** copy constructor: creates an object by initializing it with an object of the same class.
 * 
 */
public Helicopter(Helicopter helicopter)
{
	this.noCylinders = helicopter.noCylinders;
	this.creationYear = helicopter.creationYear;
	this.passengerCapacity = helicopter.passengerCapacity;
}

/** Retrieves the number of cylinders.
 * 
 * @return: The number of cylinders of type int.
 */
public int getNoCylinders()
{
	return noCylinders;
}

/** Retrieves the creation year.
 * 
 * @return: The creation year of the helicopter of type integer.
 */
public int getCreationYear()
{
	return creationYear;
}

/** Retrieves the max carrying capacity.
 * 
 * @return: The carrying capacity of the helicopter of type integer.
 */
public int getPassengerCapacity()
{
	return passengerCapacity;
}

/**
 * 
 * @param noCylinders: sets the number of cylinders of the helicopter coming from the driver class.
 */
public void setNoCylinders(int noCylinders)
{
	this.noCylinders=noCylinders;
}

/**
 * 
 * @param creationYear: sets the creation year of the helicopter coming from the driver class.
 */
public void setCreationYear(int creationYear)
{
	this.creationYear=creationYear;
}

/**
 * 
 * @param passengerCapacity: sets the maximum carrying capacity of the helicopter coming from the driver class.
 */
public void setPassengerCapacity(int passengerCapacity)
{
	this.passengerCapacity=passengerCapacity;
}

/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherHelicopter
 * @return true if both objects share all the same attriutes or else false.
 */
public boolean isEquals(Helicopter anotherHelicopter)
{
return anotherHelicopter.getPassengerCapacity() == this.getPassengerCapacity() && anotherHelicopter.getNoCylinders() == this.getNoCylinders() && anotherHelicopter.getCreationYear() == this.getCreationYear();
}

/** The toString method is a method prints out the content of an object
 * 
 * @return A string holding the content of all the paramaters in class Helicopter.
 */
public String toString() {
	
	if(type == null)
		type = " Helicopter ";
	
		 return (super.toString() + " " + getBrand() + " was created in the year " + getCreationYear()) + ". The maximum passenger capacity is " + getPassengerCapacity() + "kg and has a total number of " + getNoCylinders() + " cylinders.";


}
}

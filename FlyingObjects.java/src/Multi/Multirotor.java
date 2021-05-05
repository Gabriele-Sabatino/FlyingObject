package Multi;
import air.Airplane;
import Heli.Helicopter;
import Heli.Quadcopter;


public class Multirotor extends Helicopter { //The extends keyword is used to allow java to know that Airplane is a descendant of FlyingObject

private int noRotors;

/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 */
public Multirotor()
{
	noRotors=0;
}

/**Parameterized constructor: method that initializes the newly created object.
 * 
* @param brand: This String, sets the brand name of the Multirotor
 * @param price: This double, sets the price of the Multirotor
 * @param horsePower: This integer, sets the horspower of the Multirotor
 * @param noCylinder: This integer, sets the number of cylinder of the Multirotor
 * @param creationYear: This integer, sets the year of creation of the Multirotor
 * @param passengerCapacity: This integer, sets the passenger capacity of the Multirotor
 * @param noRotors: This integer, sets the number of rotors of the Multirotor
 */
public Multirotor(String brand,double price,int horsePower,int noCylinder,int creationYear,int passengerCapacity, int noRotors)
{

    super(brand,price,horsePower,noCylinder,creationYear,passengerCapacity);
	setNoRotors(noRotors);
}

/** copy constructor: creates an object by initializing it with an object of the same class.
 * 
 * @param multirotor
 */
public Multirotor(Multirotor multirotor)
{
this.noRotors=multirotor.noRotors;
}

/** Retrieves the number of rotors.
 * 
 * @return: an integer of number of rotors.
 */
public int getNoRotors()
{
	return noRotors;
}

/**
 * 
 * @param noRotors: sets the number of rotors coming from the driver class.
 */
public void setNoRotors(int noRotors)
{
	this.noRotors=noRotors;
}

/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherMultirotor
 * @return: A boolean, true if both objects share the same number of rotors or else false.
 */
public boolean isEquals(Multirotor anotherMultirotor)
{
return anotherMultirotor.getNoRotors() == this.getNoRotors();
}

/** The toString method is a method prints out the content of an object
 * 
 * @return: A String holding content of noRotors.
 */
public String toString() {

	if(type == null)
		type = " Multirotor ";
	
		 return (super.toString() + " It has a total number of rotors of " + getNoRotors())+ ".";

}
}

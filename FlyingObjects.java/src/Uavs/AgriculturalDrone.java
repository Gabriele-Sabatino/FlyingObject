package Uavs;
import UAV.Uav;
public class AgriculturalDrone extends Uav{ //The extends keyword is used to allow java to know that Airplane is a descendant of FlyingObject

private String brand;
private int carryCapacity;

/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 */
public AgriculturalDrone()
{
	brand="";
	carryCapacity=0;
}

/** Parameterized constructor: method that initializes the newly created object.
 * 
 * @param weight: how heavy the Uav of type double.
 * @param price: the cost of Uav of type double.
 * @param brand: the brand name of AgriculturalDrone of type String.
 * @param carryCapacity: the maximum load an AgriculturalDrone can carry of type integer.
 */
public AgriculturalDrone(double weight, double price, String brand, int carryCapacity)
{
	super(weight,price);
	setBrand(brand);
	setCarryCapacity(carryCapacity);
}

/** copy constructor: creates an object by initializing it with an object of the same class.
 * 
 * @param agriculturalDrone
 */
public AgriculturalDrone(AgriculturalDrone agriculturalDrone)
{
	this.brand=agriculturalDrone.brand;
	this.carryCapacity=agriculturalDrone.carryCapacity;
}

/** Retrieves the name of the brand.
 * 
 * @return: A name brand of type String.
 */
public String getBrand()
{
	return brand;
}

/** Retrieves the number of carrying capacity.
 * 
 * @return: The carry capacity of type double.
 */
public double getCarryCapacity()
{
	return carryCapacity;
}

/**
 * 
 * @param brand: sets the name brand of the AgriculturalDrone coming from the driver class.
 */
public void setBrand(String brand)
{
	this.brand=brand;
}

/**
 * 
 * @param carryCapacity: sets the carrying capacity of the AgriculturalDrone coming from the driver class.
 */
public void setCarryCapacity(int carryCapacity)
{
	this.carryCapacity=carryCapacity;
}


/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherAgriculturalDrone: To allow comparison with another object.
 * @return true if both objects share all the same attriutes or else false.
 */
public boolean isEquals(AgriculturalDrone anotherAgriculturalDrone)
{
return anotherAgriculturalDrone.getBrand().equals(this.getBrand()) && anotherAgriculturalDrone.getCarryCapacity()==this.getCarryCapacity();

}

/** The toString method is a method prints out the content of an object
 * 
 * @return A string holding the content of all the paramaters in class AgriculturalDrone.
 */
public String toString() {
	
	if(type == null)
		type = " AgriculturalDrone ";

		 return (super.toString() + " It is manufactured by " + getBrand() + ", it can carry up to " + getCarryCapacity() + "kg.");

}




}

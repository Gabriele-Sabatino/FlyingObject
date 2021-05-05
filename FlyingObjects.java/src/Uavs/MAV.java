package Uavs;
import UAV.Uav;
public class MAV extends Uav { //The extends keyword is used to allow java to know that Airplane is a descendant of FlyingObject

private String model;
private double size;

/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 */
public MAV()
{
	model="";
	size=0;
}

/**
 * 
 * @param weight: Sets the weight of the MAV of type double.
 * @param price: Sets the price of the Mav of type double.
 * @param model: Sets the model of the MAV of type String.
 * @param size: Sets the size of the mav of type double.
 */
public MAV(double weight, double price, String model, double size)
{
	super(weight, price);
	setModel(model);
	setSize(size);
}

/** 
 * copy constructor: creates an object by initializing it with an object of the same class.
* 
*/
public MAV(MAV mav)
{
	this.model=mav.model;
	this.size=mav.size;
}

/** Retrieves the model name of the MAV.
* 
* @return: The model name of type String.
*/
public String getModel()
{
	return model;
}

/** Retrieves the size of the MAV .
 * 
 * @return: The MAV size of type double.
 */
public double getSize()
{
	return size;
}

/**
 * 
 * @param model: sets the model name of the MAV coming from the driver class.
 */
public void setModel(String model)
{
	this.model=model;
}

/**
 * 
 * @param size: sets the size of the MAV coming from the driver class.
 */
public void setSize(double size)
{
	this.size=size;
}

/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherMav: To allow comparison with another object.
 * @return true if both objects share all the same attriutes or else false.
 */
public boolean isEquals(MAV anotherMav)
{
return anotherMav.getModel().equals(this.getModel()) && anotherMav.getSize()==this.getSize();

}

/** The toString method is a method prints out the content of an object
 * 
 * @return A string holding the content of all the paramaters in class Mav.
 */
public String toString() {

	if(type == null)
		type = " Mav ";
	
		 return (super.toString() + " This is the new " + getModel() + " and it has a size of " + getSize() + " millimeters cubed.");

}


}

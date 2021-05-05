package UAV;
import Fly.FlyingObject;



public class Uav extends FlyingObject { //The extends keyword is used to allow java to know that Airplane is a descendant of FlyingObject

private double weight;
private double price;


/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 */
public Uav()
{
	super();
	weight=0;
	//price=0;
}


/** Parameterized constructor: method that initializes the newly created object.
 * 
 * @param weight- how heavy the Uav; a double.
 * @param price- the cost of Uav; a double.
 * 
 */
public Uav(double weight, double price)
{
setWeight(weight);
setPrice(price);
}

/** copy constructor: creates an object by initializing it with an object of the same class.
 * 
 * @param uav
 */

public Uav(Uav uav)
{
this.weight=uav.weight;
this.price=uav.price;
}

/** getWeight,getPrice are accesors.
 * Allow the program to get the values.
 * 
 * @return: 
 */
public double getWeight()
{
	return weight;
}

public double getPrice()
{
	return price;
}

/** setWeight, setPrice are Mutators.
 * Allow to set the value.
 * 
 * @param 
 */
public void setWeight(double weight)
{
	this.weight=weight;
}

public void setPrice(double price)
{
	this.price=price;
}

/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherUav
 * @return true if both objects share the same weight and price, and or else false.
 */
public boolean isEquals(Uav anotherUav)
{
return anotherUav.getWeight() == this.getWeight() && anotherUav.getPrice() == this.getPrice();
}

/** The toString method is a method prints out the content of an object
 * 
 * @return A string holding content of weight and price of the uav.
 */
public String toString() {
	
	if(type == null)
		type = " Uav ";

		 return ("This" + type + "has a weight of " + getWeight() + "kg and has a price of " + getPrice() + "$.");

}
}

package air;
import Fly.FlyingObject;
public class Airplane extends FlyingObject{ //The extends keyword is used to allow java to know that Airplane is a descendant of FlyingObject

private String brand;
private double price;
private int horsePower;

/**
 * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
 * The keyword super is a word to call upon the base class.
 */
public Airplane()
{
	super();
	brand="";
	price=0;
	horsePower=0;
}

/** Parameterized constructor: method that initializes the newly created object.
 * 
 * @param brand: sets the brand name in String
 * @param price: Sets the price in double
 * @param horsePower: Sets the horsepower in integer
 */
public Airplane(String brand, double price, int horsePower)
{

	setBrand(brand);
	setPrice(price);
	setHorsePower(horsePower);
}

/** copy constructor: creates an object by initializing it with an object of the same class.
 * 
 * @param airplane
 */
public Airplane(Airplane airplane)
{
	this.brand = airplane.brand;
	this.price = airplane.price;
	this.horsePower = airplane.horsePower;
}

/** getBrand,getPrice, and getHorsepower are an accesor.
 * Allow the program to get the values, meanwhile Mutators are to change and set values.
 * 
 * @return: String for brand
 * @return: double for price
 * @return: int for horsepower
 */
public String getBrand()
{
	return brand;
}

public double getPrice()
{
	return price;
}

public int getHorsePower()
{
	return horsePower;
}

/** setBrand, setPrice, setHorsePower are Mutators.
 * Allow a change in value.
 * 
 * @param brand: Sets the brand name of type String.
 * @param price: Sets the price of the obbject of type double.
 * @param horsePower: Sets the horse power of the object of type int.
 */
public void setBrand(String brand)
{
	this.brand=brand;
}

public void setPrice(double price)
{
	this.price=price;
}

public void setHorsePower(int horsePower)
{
	this.horsePower=horsePower;
}

/**The equals method compares two object by their content not by their references.
 * 
 * @param anotherAirplane
 * @return true if both objects share the same brand, price, and horsepower or else false.
 */
public boolean isEquals(Airplane anotherAirplane)
{
return anotherAirplane.getBrand().equals(this.brand) && anotherAirplane.getPrice() == this.price && anotherAirplane.getHorsePower() == this.horsePower;
}

/** The toString method is a method prints out the content of an object
 * 
 * @return A string holding content of brand, price, and horsepower of the airplane
 */
public String toString() {
	
	
	if(type == null) //If the type of flying object is not declared then in this case type will be airplane. Type allows program to know if it is an airplane, helicopter, drone, etc..
		type = " Airplane "; 

		 return ("This" + type + "is manufactured by "+ getBrand()+". It has a horse power of " + getHorsePower() + "hp and costs " + getPrice() + "$.");
		 
		


}

}

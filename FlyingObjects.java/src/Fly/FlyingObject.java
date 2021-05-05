package Fly;

import air.Airplane;


public class FlyingObject {

	/**
	 * Price: how much the flying object costs
	 * Type: What sort of flying object is it; airplane,helicopter, etc..
	 */
    private double price; 
    public String type;
    
    /**
     * Default constructor: 1)same name, 2)no return at all, 3) public 4) No paramaterizations
     */
    public FlyingObject() {

    }
    
    /** Parameterized constructor: method that initializes the newly created object.
     * 
     * 
     * @param price: Sets the price in double of the FlyingObjects
     * 
     */
   public FlyingObject(double price, String type)
    {
    	setPrice(price);
    	setType(type);
    }

   /** copy constructor: creates an object by initializing it with an object of the same class.
    * 
    * @param flyingOject:
    */
    public FlyingObject(FlyingObject flyingOject) {
        this.price =  flyingOject.price;
        this.type =  flyingOject.type;
    }


/** Retrieves the FlyingObjects price and type.
 * 
 * @return: a price of type double.
 * @return: a string stating the type of flying object.
 */
    public double getPrice() {
        return price;
    }
    
    public String getType() {
        return type;
    }
    
    

    /**
     * 
     * @param price: sets the price of the FlyingObjects coming from the driver class.
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * 
     * @param type: sets the type of the FlyingObjects coming from the driver class.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
    * @param anotherFlyingObject
    * @return true if both objects share all the same attriutes or else false.
    */
    public boolean isEquals(FlyingObject anotherFlyingObject)
    {
    return anotherFlyingObject.getPrice()==(this.price);
    }
    
  

    

}

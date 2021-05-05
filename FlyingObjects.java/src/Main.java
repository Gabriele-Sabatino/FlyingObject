// Written by: (Gabriele Sabatino 40130099 & Mouhamed Diane 40089430)
// For COMP 249 Section (D) – Fall 2020
//Assignment (2)
//Due: October 23, 2020

/**
 * The use of the import key word is crucial in importing packages,classes.
 */
import Fly.FlyingObject;
import air.Airplane;
import Heli.Helicopter;
import Heli.Quadcopter;
import Multi.Multirotor;
import UAV.Uav;
import Uavs.AgriculturalDrone;
import Uavs.MAV;


public class Main {
	
	/** copyFlyingObjects method allows copyFlyObj to copy the content of index by index of flyobj.
	 * 
	 * @param flyObj - holds the orginal object array content.
	 * @return an array of type FlyingObject[].
	 */
	public static FlyingObject[] copyFlyingObjects(FlyingObject[] flyObj){
	       FlyingObject[] copyFlyObj = new FlyingObject[flyObj.length];
	       for(int i=0;i<copyFlyObj.length;i++){
	           copyFlyObj[i]=flyObj[i];
	       }
	       return copyFlyObj;
	   }
	
	public static void main(String[] args) {
		
		// The use of the welcome banner is to allows the user to know that the program is starting
		System.out.println("---------------------------------------------------------");
		System.out.println("         Welcome to Our Flying Objects Program!");
		System.out.println("---------------------------------------------------------");

		
		/**
		 * Creates an object array to hold all the objects refrencing other classes. 
		 * The aerial array holds atleast two object arrays per class.
		 */
        FlyingObject aerial[] = new FlyingObject [16];

		//initialize Airplane array elements
		aerial [0] = new Airplane("AIR",10.0,55);
		aerial  [1] = new Airplane("Bombardier",30,99);
		aerial  [2] = new Airplane("Takeoff",15,48);


		//initialize Helicopter array elements
		aerial [3] = new Helicopter("Heli", 23, 49, 55, 1998 , 105);
		aerial [4] = new Helicopter("Copter", 33, 87, 12, 1986 , 10);
		aerial [5] = new Helicopter("Chopper", 43, 98, 67, 2001 , 77);
		//System.out.println(employee[1]);

		//initialize Quadcopter array elements
		aerial [6] = new Quadcopter("Quad",100,87,3,1932,5,200);
		aerial [7] = new Quadcopter("Quatro",20,7,44,1972,51,28);
	//	System.out.println(quadcopter[1]);


		//initialize Multirotor array elements
		aerial [8] = new Multirotor("Multi",102,55,1,1966,12,98);
		aerial [9] = new Multirotor("Rotor",107,95,11,1969,14,91);


		//initialize Uav array elements
		aerial [10] = new Uav(480,599);
		aerial [11] = new Uav(480,599);
		//initialize AgriculturalDrone array elements
		aerial [12] = new AgriculturalDrone(432, 699, "Agri", 104);
		aerial [13] = new AgriculturalDrone(498, 700, "AgriDrone",132);
		//initialize Mav array elements
		aerial [14] = new MAV(220, 1000, "Mavric", 329);
		aerial [15] = new MAV(289, 1005, "Mavic", 399);

		
		/**
		 * For loop to compare and print the aerial array.
		 */
		for(int i=0; i<aerial.length-1;i++)
		{
			int j=i+1;
			if(aerial[i].isEquals((aerial[i+1])))
			{
				System.out.println("aerial "+i + " is equal to aerial "+j);
			    System.out.println();
			}
				System.out.println(aerial[i] + "\n");
		}
		
		 



		
		/**
		 * Lines 107 to 128 comprise of tracing the least and 2nd least expensive object in the aerial array.
		 * The index of where the two objects are found in the aerial array are also given.
		 */
        double minimum1 = Double.MAX_VALUE, minimum2 = minimum1; //Creating the minimum variables to find the least and second least priced object
        int index1=-1,index2 = -1; //creating two indexs to find the location of the least and second least priced object.
        for (int i = 0; i < aerial.length; i++) {
            FlyingObject flyob = aerial[i];
            if (flyob.getPrice() < minimum1) {
                minimum2 = minimum1;
                minimum1 = flyob.getPrice();
                index2 = index1;
                index1 = i;
            }
            else if (flyob.getPrice() < minimum2) {
                index2 = i;
                minimum2 = flyob.getPrice();
            }
        }
        System.out.println("2nd least expensive object information:");
        System.out.println("Location: " + (index2 + 1)); 
        System.out.println("Price: " + minimum2 + "$");
        System.out.println("");
        System.out.println("Least expensive object information:");
        System.out.println("Location: " + (index1 + 1));
        System.out.println("Price: " + minimum1 + "$");
        
        System.out.println();
        
        /**
         * This is where the copy array is printed out through the use of an advance for loop, allowing a simple way to go through an array.
         * The copied array has the same information as the orginal array as seen in the Copyobject array.
         */
	       System.out.println("-------------After copying---------------\n");
	       FlyingObject[] copyObjects=copyFlyingObjects(aerial); // copy objects array
	       for(FlyingObject Copyobject : copyObjects){
	           System.out.println(Copyobject + "\n"); 
	       } 
	       
	       //Allows user to know the program is done.
	       System.out.println("Thank you for using Flying Objects!");
	       
}


	}









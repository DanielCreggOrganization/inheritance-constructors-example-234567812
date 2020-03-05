public class Bicycle {

	// the Bicycle class has three fields (instance veriables - should be private)
	private int cadence; // set to zero since there is no value like for eg int bee = 1;)
	private int gear;
	private int speed;
	
	// Default constructor (default contstractor as long as doesn't have any inputs)
   public Bicycle(){
        cadence = 0;
	    gear = 0;
	    speed = 0;
       System.out.println("I just created a Bicycle!!!");
   }

  // Parameterised constructor 
	public Bicycle(int cadence, int gear, int speed) {
        // Your code here
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        System.out.println("I just created a Bicycle!!!");
	}
	
    // Getters and Setters here
    public int getCadence(){
        return cadence;
    }

    public void setCadence(int cadence){
        this.cadence = cadence;
    }

    public int getGear(){
        return gear;
    }

    public void setGear(int gear){
        this.gear = gear;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed= speed;
    }
	// Extra methods here
	public void applyBrake(int speedDecrement) {
		speed -= speedDecrement;
	}

	public void speedUp(int speedIncrement) {
        // Your code here
       speed += speedIncrement;
	}

}

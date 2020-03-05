public class MountainBike extends Bicycle {
    
    // the MountainBike subclass adds one field
    public int seatHeight;


    // Default Constructor
    public MountainBike(){
        seatHeight = 0;

    }
    // Paramiterised constructor
    public MountainBike(int cadence, int gear, int speed, int seatHeight) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
        System.out.println("I just created Mountain Bike!!!");

    }
    // Paramiterised constructor
//    public MountainBike(int startHeight) {
//    	seatHeight = startHeight;
//    }  
    
    // Paramiterised constructor using super keyword 
        
    // Getters and Setters
}

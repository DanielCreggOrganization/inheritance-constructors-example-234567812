public class Main{
//Main class

public static void main(String[] args) {
    // Bicycle bicycleObject1 = new Bicycle();
     MountainBike mountainBikeObject1 = new MountainBike(1,2,3,4); 
    
   // System.out.println(bicycleObject1.cadence);
    System.out.println(mountainBikeObject1.getGear()); //it will call both objects

    mountainBikeObject1.applyBrake(2);
    System.out.println(mountainBikeObject1.getCadence());
}


}// end main class


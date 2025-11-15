package bicycle;
public class MountainBike extends inheritence {
   private int gear;
    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getGear() {
        return gear;
    }
   void display(){
       System.out.println("number of gear"+gear);
       System.out.println("Maker " + maker);
   }
}

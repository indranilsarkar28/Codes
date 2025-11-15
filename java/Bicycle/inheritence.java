
package bicycle;

public class inheritence {
    private int numberOfWheel;
    protected String maker;
    inheritence(){
        
    }
    inheritence (int numberOfWheel,String maker){
        this.numberOfWheel=numberOfWheel;
        this.maker=maker;
    }
//      
    void display(){
       System.out.println("Number of Wheel = "+ numberOfWheel);
       System.out.println("Maker " + maker);
   }
}

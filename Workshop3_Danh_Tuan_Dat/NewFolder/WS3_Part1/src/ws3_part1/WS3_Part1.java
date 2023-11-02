
package ws3_part1;

/**
 *
 * @author tuandat
 */
public class WS3_Part1 {

    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.pressStartButton();
        mercedes.pressAcceleratorButton();
        System.out.println(mercedes);

        Car audi = new Car("red", 100, true, true);
        audi.pressAcceleratorButton();
        audi.setColour("black");
        System.out.println("Colour of audi:" + audi.getColour());
        System.out.println(audi);
        
        
        
    }
    
}

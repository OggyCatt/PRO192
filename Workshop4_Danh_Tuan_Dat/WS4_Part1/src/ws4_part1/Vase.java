
package ws4_part1;

import java.util.Scanner;

/**
 *
 * @author tuandat
 */
public class Vase extends Item {
    private int height;
    private String material;

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    Vase() {
    }
    
    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase() {
        super.output();

        System.out.println("Height: " + this.height);
        System.out.println("Marterial: " + this.material);
    }

    public void inputVase() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height: ");
        this.height = Validation.checkInputIntLimit(0, Integer.MAX_VALUE);

        System.out.println("Enter marterial: ");
        this.material = sc.nextLine();
    }
    
    
    
}

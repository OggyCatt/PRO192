
package ws4_part1;

import java.util.Scanner;

/**
 *
 * @author tuandat
 */
public class Item {
    private int value;
    private String creator;
    
    //constructor
    public Item(){
        
    }
    //constructor
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;    
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
               
    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }

    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator" + this.creator);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        this.value = Validation.checkInputIntLimit(0, Integer.MAX_VALUE);

        System.out.println("Enter creator: ");
        this.creator = sc.nextLine();
    }
        
        
            
            
            
        
        
}
    
    
    


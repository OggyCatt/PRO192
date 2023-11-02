
package btl_2_hashmap;

import btl_2_hashmap.model.Product;
import java.awt.AWTEventMulticaster;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tuandat
 */
public class BTL_2_hashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kq;
        Product a = new Products();
        var productMap = new HashMap<Product>();
        Scanner sc = new Scanner(System.in);
        do {     
            menu();
            kq = sc.nextInt();
            switch (kq) {
                case 1:
                    HashMap<String , Product> = nhap();
                    
                    
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    break;
                case 4:
                    break;
                    
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    
            }
            
        } while (kq != 10);
        
        
    }
    
    public static void menu(){
        System.out.println("""
                           1 \u2013Add productinformaton
                            2 \u2013 Show all products 
                            3 \u2013 Delete a product
                            4 \u2013 Filter productsby SUPPLIER
                            5 \u2013 Sort by name (ASC)
                            6- Sort by value (DES)
                            7 \u2013 Statics the products by SUPPLIER 
                            8 \u2013 Save data to file
                            9 \u2013 Load data from file
                            10 \u2013 Exit program""");
    }
    
    public static void nhap(){
        
    }
    
    
}

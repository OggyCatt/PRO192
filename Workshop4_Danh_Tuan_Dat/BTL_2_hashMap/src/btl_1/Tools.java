package btl_1;


import java.util.Scanner;



/**
 *
 * @author tuandat
 */
public class Tools {
    public static String inputString(String mess){
        var result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print(mess);
        result = sc.nextLine();        
        return result;       
    }
    
    public static int inputInt(String mess){
        int result;
        result = Integer.parseInt(inputString(mess));
        return result;          
    }
    public static double inputDouble(String mess){
        double result;
        result = Double.parseDouble(inputString(mess));
        return result;    
    }
    
    public static boolean inputBoolean(String mess){
        int result;
        result = inputInt(mess);
        return result == 1;          
    }
    
    
    
}

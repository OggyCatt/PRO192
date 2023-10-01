package ws1_part2;
import java.util.Scanner;
/**
 *
 * @author tuandat
 */
public class WS1_Part2 {
    public static void main(String[] args) {
        float a, b;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        a = sc.nextFloat();
        System.out.println("Nhập số thứ 2: ");
        b = sc.nextFloat();
        System.out.println("Nhập phép toán: ");
        sc = new Scanner(System.in);
        op = sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.printf("%f + %f = %f", a,b,(a + b));
                break;
            case '-':
                System.out.printf("%f - %f = %f", a, b, (a - b));
                break;
            case '*':
                System.out.printf("%f - %f = %f", a, b, (a * b));
                break;
            case '/':
                if(b == 0)
                    System.out.println("Không thể chia cho 0");
                else
                    
                    System.out.printf("%f / %f = %f", a, b, (a / b));
                break;
                 
            default:
                System.out.println("Lỗi rồi");
                throw new AssertionError();
        }
        
        
        
        
        
    }
    
}

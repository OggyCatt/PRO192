package ws1_part1;
import java.util.Scanner;
/**
 *
 * @author tuandat
 */
public class WS1_Part1 {
    public static void main(String[] args) {
        int m[][];
        int c;
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        r = sc.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        c = sc.nextInt();
        m = new int[r][c];
        System.out.println("Nhập giá trị: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("\n m["+i+"] ["+j+"] =  ");
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("Đã thêm giá trị!");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                System.out.format("%3d", m[i][j]);
            System.out.println("\n");
        }
        
        System.out.println("Sum: " +sumA(m,r,c));
        System.out.println("Average = " + (float)sumA(m,r,c)/(r*c));
       
    }
    
    public static int sumA(int m[][], int r, int c){
        int sum = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sum += m[i][j];
            }
        }
        
        return sum;
        
    }
    
    
    
}

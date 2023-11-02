package btl_1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tuandat
 */
public class BTL_1 {

    public static void main(String[] args) {
        int kq;
        List <Accountant> ds;
        ds = new ArrayList<>();      
        Scanner sc = new Scanner(System.in);   
        do {
            menu();  
            kq = sc.nextInt();
            switch (kq){
                case 1:
                    //thêm kế toán
                    Accountant x = enterAccInfo();
                    ds.add(x);
                    break;
                case 2:
                    //show bảng kế toán
                    if(ds.isEmpty())
                        System.out.println("Không có nhân viên nào!");
                    else
                        showAll(ds);   
                    break;
                case 3:
                    //xoá kế toán
                    break;
                case 4:
                    //hiển thị người có lương cao
                    break;                  
                default:
                    System.out.println("Good bye");
            }
                      
        } while (kq != 5);
    }
    
    
    public static void menu(){
        System.out.println("-------------------------");
        System.out.println("""
                            1 \u2013 Add acountant information
                            2 \u2013 Show all accountants
                            3 \u2013 Delete an accountant
                            4 \u2013 Filter accountants by high salary
                            5 \u2013 Exit program""");
        System.out.println("-------------------------");
        
    }

    private static Accountant enterAccInfo() {
        Accountant x = new Accountant();
        x.setId(Tools.inputString("ID: "));
        x.setFirstName(Tools.inputString("Your firstname: "));
        x.setSureName(Tools.inputString("Your surename: "));
        x.setPhone(Tools.inputString("Your phone: "));
        x.setGender(Tools.inputBoolean("1--Male 2--Female: " ));
        x.setBacsicSalary(Tools.inputDouble("Your basic salary: "));
        x.setReward(Tools.inputInt("Your reward: "));      
        return x;     
    }

    private static void showAll(List<Accountant> ds) {
        for(Accountant i : ds){
            System.out.println(i);
        }
            
        
    }
    
    
    
}

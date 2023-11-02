
package workshop5_danh_tuan_dat;

import workshop5_danh_tuan_dat.model.BeeColony;
import workshop5_danh_tuan_dat.model.Colony;
import workshop5_danh_tuan_dat.model.FPTUni;
import workshop5_danh_tuan_dat.model.Role;
import workshop5_danh_tuan_dat.model.University;

/**
 *
 * @author tuandat
 */
public class WorkShop5_Danh_Tuan_Dat {
    public static void main(String[] args) {
         Colony a = new BeeColony(2000, "honey", "land");
        System.out.println(a);
        a.grow();
        a.reproduce();
        University b = new FPTUni(100000, "FPT", "Cantho");
        System.out.println(b);        
        b.enroll();
        b.educate();
        Role c = new BeeColony(3000, "wasp", "land");
        System.out.println(c);
        c.createWorker();
        c = new FPTUni(100000, "FPT", "Hanoi");
        System.out.println(c);
        c.createWorker();
    }
    
}

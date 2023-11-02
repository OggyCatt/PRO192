
package btl_1;

import java.util.Date;

/**
 *
 * @author tuandat
 */
public class Accountant extends Person implements Working{
    private double basicSalary;
    private int reward;
    
    public Accountant(){  
        super();
    }

    public Accountant(double basicSalary, int reward) {
        this.basicSalary = basicSalary;
        this.reward = reward;
    }

    public Accountant(double basicSalary, int reward, String id, String firstName, String sureName, Date birthDay, String phone, boolean gender) {
        super(id, firstName, sureName, birthDay, phone, gender);
        this.basicSalary = basicSalary;
        this.reward = reward;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
    
    public double getBasicSalary(){
        return basicSalary;
    }
    
    public void setBacsicSalary(double basicSalary) {
        this.basicSalary = basicSalary;      
    }

    @Override
    public double earnMonney() {
        return this.basicSalary+this.reward;
    }

    @Override
    public double tax() {
        return this.earnMonney() < 1000? 0: this.earnMonney() < 3000? 0.1*(this.earnMonney()-1000): 0.25*(this.earnMonney()-3000);
        
    }
    

   
    
    
    
    
}

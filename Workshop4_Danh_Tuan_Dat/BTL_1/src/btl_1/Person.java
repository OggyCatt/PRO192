
package btl_1;

import java.util.Date;

/**
 *
 * @author tuandat
 */
public class Person {
    private String id;
    private String firstName;
    private String sureName;
    private Date birthDay;
    private String phone;
    private boolean gender;
    
    public Person(){
        this.id = "";
        this.firstName = "";
        this.sureName = "";
        this.birthDay = new Date(1900,1,1);
        this.phone = "";
        
        
    }

    public Person(String id, String firstName, String sureName, Date birthDay, String phone, boolean gender) {
        this.id = id;
        this.firstName = firstName;
        this.sureName = sureName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", sureName=" + sureName + ", birthDay=" + birthDay + ", phone=" + phone + ", gender=" + gender + '}';
    }
    
    
    
    
            
    
}

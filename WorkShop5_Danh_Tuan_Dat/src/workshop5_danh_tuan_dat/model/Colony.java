
package workshop5_danh_tuan_dat.model;

/**
 *
 * @author tuandat
 */
public class Colony extends Organization{
    protected String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
    
    
    public Colony(){
        super();
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public void communicatedByTool() {
        System.out.println("the colony communicate by sound");
    }

    @Override
    public String toString() {
        return "the colony size is: "+this.size + "the colony’s place is:" +this.place;
    }
    
    
    
    
}
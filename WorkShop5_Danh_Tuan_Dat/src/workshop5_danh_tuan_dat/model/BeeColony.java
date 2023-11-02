
package workshop5_danh_tuan_dat.model;

/**
 *
 * @author tuandat
 */
public class BeeColony extends Colony implements Role{
    protected String type;
    
    public BeeColony(){
        super();
    }

    public BeeColony(int size , String place, String type) {
        super(place, size);
        this.type = type;
    }

    @Override
    public void communicatedByTool() {
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "the colony type is: " + this.type+ "size is about:" + this.size + "the place is: " + this.place;
    }
    
    
    
    
}

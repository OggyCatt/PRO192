
package workshop5_danh_tuan_dat.model;

/**
 *
 * @author tuandat
 */
public abstract class Organization {
    protected int size;

    public Organization(int size) {
        this.size = size;
    }
    
    public Organization(){
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communicatedByTool();
    

    @Override
    public String toString() {
        return "Organization{" + "size=" + size + '}';
    }
    
    
    
}

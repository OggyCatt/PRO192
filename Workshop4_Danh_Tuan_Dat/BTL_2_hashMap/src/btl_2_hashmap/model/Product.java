
package btl_2_hashmap.model;

/**
 *
 * @author tuandat
 */
public class Product implements Valuable {
    private String productCode;
    private String productName;
    private String supplier;
    private String unit;
    private double price; 
    private float quantity;
    private boolean hasPromotion;
    
    public Product(){        
    }

    public Product(String productCode, String productName, String supplier, String unit, double price, float quantity, boolean hasPromotion) {
        this.productCode = productCode;
        this.productName = productName;
        this.supplier = supplier;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
        this.hasPromotion = hasPromotion;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public boolean isHasPromotion() {
        return hasPromotion;
    }

    public void setHasPromotion(boolean hasPromotion) {
        this.hasPromotion = hasPromotion;
    }

     @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", supplier='" + supplier + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", hasPromotion=" + hasPromotion +
                '}';
    }

    @Override
    public float value() {
        return (float) (this.quantity*this.price);
    }

    @Override
    public float vat() {
        return 0.08f*this.value();
    }

    @Override
    public float promotion() {
        return this.hasPromotion? 0.15f*this.value():0;
    }
    
    
    
    
    
    
}

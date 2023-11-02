
package btl_2_hashmap.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author tuandat
 */
public class Products extends HashMap<String, Product>{
    public Products(){
        super();
    }   
    HashMap<String, Product> productHashMap = new HashMap<>();
    
    public void addProduct(String productCode,Product product ){
        productHashMap.put(productCode, product);      
    }
    
    @SuppressWarnings("empty-statement")
    public void showAll(HashMap<String , Product> l){
        for(Product product : productHashMap.values())
            System.out.println(product);
    }
    
    public void deleteProduct(String productCode){
        productHashMap.remove(productCode);       
    }
    
    public List<Product> fillterBySup(String sup){
        List<Product> fillter = new ArrayList<>();
        for(Product product : productHashMap.values()){
            if(!product.getSupplier().equals(product)) {
            } else {
                fillter.add(product);
            }
        }       
        return fillter;
    }
    
    public void sortByName(){
        List<Product> productList = new ArrayList<>();
        productList.sort(Comparator.comparing(Product::getProductName));
        showProducts(productList);
        
    }
    
    public void sortByValue(){
        List<Product> productList = new ArrayList<>();
        productList.sort(Comparator.comparing(Product::value).reversed());
        showProducts(productList);
    }
    
    public void save(){
        
    }
    

    @SuppressWarnings("empty-statement")
    private void showProducts(List<Product> productList) {
        for(Product product : productList)       
            System.out.print(product);
    }


    
    

            
            
    
    

        
             
    
    
    
}

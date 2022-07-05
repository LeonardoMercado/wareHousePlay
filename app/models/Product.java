package models;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints;
import play.mvc.PathBindable;


/**
 * Clase para instanciar objetos tipo producto
 * @author leonardo
 * @param
 */
public class Product implements PathBindable<Product> {
    //-----Atributos----------------------------------------------------------------------------------------
    // De clase:
    private static List<Product> products;
    static {
        products = new ArrayList<Product>();
        products.add(new Product("111111111111","Paperclips 1","Paperclips description 1"));
        products.add(new Product("222222222222","Paperclips 2","Paperclips description 2"));
        products.add(new Product("333333333333","Paperclips 3","Paperclips description 3"));
        products.add(new Product("444444444444","Paperclips 4","Paperclips description 4"));
        products.add(new Product("555555555555","Paperclips 5","Paperclips description 5"));
    }
    // De instancia:
    @Constraints.Required
    private String ean;
    @Constraints.Required
    private String name;
    private String description;
    //------------------------------------------------------------------------------------------------------

    //----Constructores-------------------------------------------------------------------------------------
    public Product(){}
    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }
    //------------------------------------------------------------------------------------------------------

    //----METODOS-----------------------------------------------------------------------------------------
    public static List<Product> findAll(){
        return new ArrayList<Product>(products);
    }
    public static Product findByEan(String ean){
        for(Product candidate : products){
            if(candidate.getEan().equals(ean)){
                return candidate;
            }
        }
        return null;
    }
    public static List<Product> findByName(String term){
        final List<Product> result = new ArrayList<Product>();
        for(Product candidate : products){
            if(candidate.getName().toLowerCase().contains(term.toLowerCase())){
                result.add(candidate);
            }
        }
        return result;
    }
    public static boolean remove(Product product){
        return products.remove(product);
    }
    public void save(){
        products.remove(findByEan(this.ean));
        products.add(this);
    }
    //------------------------------------------------------------------------------------------------------


    //------GETTERS AND SETTERS-----------------------------------------------------------------------------
    public String getEan() {
        return ean;
    }
    public void setEan(String ean) {
        this.ean = ean;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean existeProducto(){
        return false;
    }
    //------------------------------------------------------------------------------------------------------

    // Métodos Sobreecritos:
    //-----ToString----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Producto: " + '\n' +
                "ean= " + ean + '\n' +
                "name= " + name + '\n' +
                "description= " + description + '\n';
    }

    @Override
    public Product bind(String key, String txt) {
        Product product = Product.findByEan(txt);
        if(product!=null){
            return findByEan(txt);
        }else{
            Product product1 = new Product();
            product1.setEan(txt);
            return product1;
        }
    }

    @Override
    public String unbind(String key) {
        return this.ean;
    }

    @Override
    public String javascriptUnbind() {
        return this.ean;
    }
    //------------------------------------------------------------------------------------------------------
}

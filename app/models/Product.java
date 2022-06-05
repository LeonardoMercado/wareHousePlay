package models;

/**
 * Clase para instanciar objetos tipo producto
 * @author leonardo
 * @param
 */
public class Product {
    private String ean;
    private String name;
    private String description;

    public Product(){}

    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

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
    //------------------------------------------------------------------------------------------------------

    //-----To String----------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Product{" +
                "ean='" + ean + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------
}

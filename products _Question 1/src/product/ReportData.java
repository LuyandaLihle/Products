/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Mongezi
 */
public class ReportData {
    private String productCode;
    private String productName;
    private int productCategory;
    private String productWarrenty;
    private double productPrice;
    private int productLevel;
    private String productSupplier;
    
    

    public ReportData(String productCode,String productName,int productCategory, String productWarrenty, double productPrice,int productLevel, String productSupplier) {
    this.productCode = productCode;
    this.productName = productName;
    this.productCategory = productCategory;
    this.productWarrenty = productWarrenty;
    this.productPrice = productPrice;
    this.productLevel = productLevel;
    this.productSupplier = productSupplier;
        
        }

    ReportData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductWarrenty() {
        return productWarrenty;
    }

    public void setProductWarrenty(String productWarrenty) {
        this.productWarrenty = productWarrenty;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(int productLevel) {
        this.productLevel = productLevel;
    }

    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    

   
    
}

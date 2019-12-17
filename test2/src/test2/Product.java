package test2;

public class Product {
    protected String productName; // Label 2
    protected String productCode;

    public Product(){ // method 1
        this.productCode = "Unassigned";
        this.productName = "Unaasigned";
    }

    public Product(String S,String N){ //method 2
        this.productCode = S;
        this.productName = N;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }
}

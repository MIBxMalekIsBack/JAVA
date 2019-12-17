package huhuh;

public class Inventory extends Product{
    private int productQuantity;

    public Inventory(){
        this.productCode = "Unassigned"; //Label 3a
        this.productName = "Unassigned"; // Label 3b
        this.productQuantity = 10;
    }

    public Inventory(String C, String N, int Q){
        this.productCode = C;
        this.productName = N;
        this.productQuantity = Q;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}

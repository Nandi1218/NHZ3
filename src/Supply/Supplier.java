package Supply;

public class Supplier {
    private String supplierName;
    private int prodId;
    private int prodName;
    private int amount;
    private double price;

    public Supplier(String supplierName, int prodId, int prodName, int amount, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.amount = amount;
        this.price = price;
        this.supplierName=supplierName;
    }
}

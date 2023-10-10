package Supply;

public class Supplier {
    private String supplierName;
    private int prodId;
    private int amount;
    private double price;

    public Supplier(String supplierName, int prodId, int amount, double price) {
        this.prodId = prodId;
        this.amount = amount;
        this.price = price;
        this.supplierName=supplierName;
    }
}

package supply;

public class Supplier {
    private final String supplierName;
    private final int prodId;
    private final int amount;
    private final double price;

    public Supplier(String supplierName, int prodId, int amount, double price) {
        this.prodId = prodId;
        this.amount = amount;
        this.price = price;
        this.supplierName = supplierName;
    }
}

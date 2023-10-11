package supply;
import product.Product;
public class Supplier {
    private String supplierName;
    Product product;
    private int amount;
    private double price;

    public Supplier(String supplierName, Product product, int amount, double price) {
        this.supplierName = supplierName;
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return supplierName + ' ' +product.getId() + " " + amount + " " + price;
    }
}

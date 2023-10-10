import Product.*;
import Supply.*;
import Vendor.*;
public class Main {
    public static void main(String[] args) {
        Product alma = new Product(12,"alma",199.99);
        //System.out.println(alma.toString());
        Vendor vendor = new Vendor(200.00);
        vendor.addProduct(alma,200);
        vendor.listStock();
    }
}
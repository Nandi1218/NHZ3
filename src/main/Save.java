package main;

import product.Product;
import supply.Supplier;
import vendor.Vendor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Save {
    public static void save(ArrayList<Vendor> vendors, ArrayList<Supplier> suppliers, ArrayList<Product> products) throws IOException {
        FileWriter fileWriter = new FileWriter("vendors.txt");
        for (Vendor vendor : vendors) {
            fileWriter.write(vendor.getName() + " " + vendor.getMoney() + "\n");
            for (Product product : vendor.getProductArrayList()) {
                fileWriter.write(product.getId() + " " + vendor.getProductDictionary().get(product) + "\n");
            }

        }
        fileWriter.close();
        fileWriter = new FileWriter("products.txt");
        for (Product p :
                products) {
            fileWriter.write(p.toString() + "\n");
        }
        fileWriter.close();
        fileWriter = new FileWriter("suppliers.txt");
        for (Supplier s :
                suppliers) {
            fileWriter.write(s.toString() + "\n");
        }
    }
}

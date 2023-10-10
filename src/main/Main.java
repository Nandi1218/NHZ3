package main;

import product.Product;
import supply.Supplier;
import vendor.Vendor;

import java.io.IOException;
import java.util.ArrayList;

import static main.Save.save;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vendor> vendors = new ArrayList<>();
        ArrayList<Supplier> suppliers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        try {
            Load.load(vendors, suppliers, products);
            for (Vendor v :
                    vendors) {
                v.listStock();
            }
            save(vendors, suppliers, products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
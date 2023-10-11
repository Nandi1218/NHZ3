package main;

import product.Product;
import supply.Supplier;
import vendor.Vendor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Load {
    public static void load(ArrayList<Vendor> vendors, ArrayList<Supplier> suppliers, ArrayList<Product> products) throws IOException {
        //Products load into ArrayList products
        Scanner fileReader = new Scanner(new File("products.txt"));
        while (fileReader.hasNextLine()) {
            String[] line = fileReader.nextLine().split(" ");
            products.add(new Product(line[1], Double.parseDouble(line[2])));
        }
        fileReader.close();
        //Vendors load into ArrayList vendors
        fileReader = new Scanner(new File("vendors.txt"));
        int i = -1;
        while (fileReader.hasNextLine()) {
            String[] line = fileReader.nextLine().split(" ");
            if (!(line[0].charAt(0) >= '0' && line[0].charAt(0) <= '9')) {
                vendors.add(new Vendor(line[0], Double.parseDouble(line[1])));
                i++;
            } else {
                for (Product p : products)
                    if (p.getId() == Integer.parseInt(line[0]))
                        vendors.get(i).addProduct(p, Integer.parseInt(line[1]));
            }
        }
        //Suppliers load into ArrayList suppliers
        fileReader.close();
        fileReader=new Scanner(new File("suppliers.txt"));
        while (fileReader.hasNextLine())
        {
            String[] line = fileReader.nextLine().split(" ");
            if(line.length>1)
                for (Product p : products)
                    if (p.getId() == Integer.parseInt(line[1]))
                        suppliers.add(new Supplier(line[0],p,Integer.parseInt(line[2]),Double.parseDouble(line[3])));
        }
        fileReader.close();
    }
}

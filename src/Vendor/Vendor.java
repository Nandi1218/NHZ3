package Vendor;
import Product.Product;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;


public class Vendor {
    String name; //name of vendor
    private Dictionary<Product,Integer> productDictionary = new Hashtable<Product, Integer>(); //Product type and number of product
    private ArrayList<Product> productArrayList = new ArrayList<>();
    private double money;
    //Available suppliers ArrayList<Suppliers> suppliers = new ArrayLis();
    public Vendor(String name,double money){
        this.money=money;
        this.name=name;
    }
    public void addProduct(Product product,int num){
            productArrayList.add(product);
            productDictionary.put(product,num);
    }
    public void listStock()
    {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i)+" "+productDictionary.get(productArrayList.get(i)));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dictionary<Product, Integer> getProductDictionary() {
        return productDictionary;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

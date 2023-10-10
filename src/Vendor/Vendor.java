package Vendor;
import Product.Product;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;


public class Vendor {
    private Dictionary<Product,Integer> productDictionary = new Hashtable<Product, Integer>();
    private ArrayList<Product> productArrayList = new ArrayList<>();
    private double money;
    //Available suppliers ArrayList<Suppliers> suppliers = new ArrayLis();
    public Vendor(double money){
        this.money=money;
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


}

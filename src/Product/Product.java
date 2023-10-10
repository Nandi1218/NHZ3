package Product;

public class Product {
    private static int sid=0;
    private int id;
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.id=sid;
        sid++;
        this.name = name;
        this.cost = cost;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id +" " + name +" " + cost;
    }
}

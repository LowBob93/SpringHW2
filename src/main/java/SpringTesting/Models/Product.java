package SpringTesting.Models;

public class Product {
    private long id;
    private String name;
    private double cost;

    public Product() {
    }

    public Product(long id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product ID " + id + " Title: " + name + " Coast: " + cost;
    }
}
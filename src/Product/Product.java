package Product;

public class Product {

    String name;
    double price;

    //empty constructor
    public Product () {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}

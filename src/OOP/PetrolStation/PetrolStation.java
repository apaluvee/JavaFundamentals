package OOP.PetrolStation;

public class PetrolStation {

    double price;
    double petrolAmount;

    public PetrolStation () {
    }

    public PetrolStation(double price, double petrolAmount) {
        this.price = price;
        this.petrolAmount = petrolAmount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPetrolAmount() {
        return petrolAmount;
    }

    public void setPetrolAmount(double petrolAmount) {
        this.petrolAmount = petrolAmount;
    }

    @Override
    public String toString() {
        return "Petrol.OOP.PetrolStation{" +
                "price=" + price +
                ", petrolAmount=" + petrolAmount +
                '}';
    }
}

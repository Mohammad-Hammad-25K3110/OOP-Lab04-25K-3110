package Lab04_Tasks;

public class Mobile {
    private String brand;
    private String model;
    private double price;

    Mobile(String Pbrand, String Pmodel, double Pprice) {
        this.brand = Pbrand;
        this.model = Pmodel;
        this.price = Pprice;
    }

    Mobile(String Pbrand, String Pmodel) {
        this(Pbrand, Pmodel, 0);
    }

    Mobile(String Pbrand) {
        this(Pbrand, "Unknown", 0);
    }

    Mobile() {
        this("Unknown", "Unknown", 0);
    }

    public void displayInformation() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy S23", 75000);
        Mobile m2 = new Mobile("Apple", "iPhone 14");
        Mobile m3 = new Mobile("Nokia");
        Mobile m4 = new Mobile();
        m1.displayInformation();
        m2.displayInformation();
        m3.displayInformation();
        m4.displayInformation();
    }
}


package Objects;

public class Table {

    /*
     * european, so everything is in cm and kg
     */


    //attributes - variables
    double height;
    double width;
    double length;
    double weight;
    double price;

    int legs;

    String material;
    String color;

    boolean mobile;
    boolean foldable;

    //default constructor
    public Table(){
        height = 23;
        width = 40;
        length = 936;
        weight = 52;
        price = 50;
    }
    // getters/accessors
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}

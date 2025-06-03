package Objects;

public class Table {

    /*
     * european, so everything is in cm and kg
     *
     */


    //attributes - variables
    private double height;
    private double width;
    private double length;
    private double weight;
    private double price;

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

    public Table(double height, double width, double length, double weight){
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
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

    // setters/ mutators
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWeight(double weight) {
        if(weight <= 1000) {
            this.weight = weight;
        }
        else {
            this.weight = 1000;
        }
    }
    public void setPrice(double price) {
        this.price = price;
    }

}

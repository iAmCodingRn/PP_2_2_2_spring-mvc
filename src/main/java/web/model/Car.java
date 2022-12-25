package web.model;

public class Car {
    private String color;
    private String name;
    private int miles;

    public Car(String color, String name, int miles) {
        this.color = color;
        this.name = name;
        this.miles = miles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
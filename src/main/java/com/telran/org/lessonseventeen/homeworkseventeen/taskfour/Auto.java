package com.telran.org.lessonseventeen.homeworkseventeen.taskfour;

public class Auto {
    private String number;
    private Colour colour;
    private Brand brand;
    private int mileage;
    private int price;

    public Auto(String number, Colour colour, Brand brand, int mileage, int price) {
        this.number = number;
        this.colour = colour;
        this.brand = brand;
        this.mileage = mileage;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public Colour getColour() {
        return colour;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number='" + number + '\'' +
                ", colour=" + colour +
                ", brand=" + brand +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}

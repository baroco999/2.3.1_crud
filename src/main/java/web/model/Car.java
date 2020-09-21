package web.model;

public class Car {
    private String brand;

    private int age;

    private int mileage;

    public Car() {
    }

    public Car(String brand, int age, int mileage) {
        this.brand = brand;
        this.age = age;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return brand + " / " + age + " years / " + mileage + " km mileage";
    }
}

package day6;

public class Motorbike {
    private int yearOfManufacture;
    private String colour;
    private String model;

    public Motorbike(int yearOfManufacture, String colour, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.colour = colour;
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if (this.yearOfManufacture > inputYear) return this.yearOfManufacture - inputYear;
        else return inputYear - this.yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }
}
/*2. int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает
 разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).

В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

 */

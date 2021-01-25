package day6;

public class Car {
    private int yearOfManufacture;
    private String colour;
    private String model;


    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear){
        if (this.yearOfManufacture > inputYear)  return this.yearOfManufacture - inputYear;
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

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
/*Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
        Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
        Задать значение для каждого поля, используя set методы.
        Вывести в консоль значение каждого из полей, используя get методы.
        Созданный вами класс должен отвечать принципам инкапсуляции.*/

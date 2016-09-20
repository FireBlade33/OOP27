package lesson3;

public class Car {
    private String model;
    private String color;
    private Integer year;


    public Car(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car(String model, String color) {
        this(model, color, 2002);
    }

    public Car(){
        this("Honda", "Черный", 1998);
    }

    public Car(String model){
        this(model, "Черный");
    }





    public void printAbout() {
        System.out.println(
                "Модель: " + model + "\n" +
                "Цвет  : " + color + "\n" +
                "Год   : "  + year  + "\n");
    }
}

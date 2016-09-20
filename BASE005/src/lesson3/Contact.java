package lesson3;

public class Contact {

    private String name;
    private String surName;
    private Integer number;

    public Contact(String name, String surName, Integer number){
        this.name = name;
        this.surName = surName;
        this.number = number;
    }

    public void printAbout(){
        System.out.println(
                "ФИО            : " + name + surName + "\n" +
                "Номер телефона : " + number + "\n"
        );
    }

    public Integer getNumber(){
        return number;
    }
}

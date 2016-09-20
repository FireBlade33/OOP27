package lesson3;

import java.util.ArrayList;

public class Phone {

    private String model;
    private SimCard simCard;
    private ArrayList<Contact> bookContact;

    public Phone(SimCard simCard){
        this.simCard = simCard;
        this.model = "iPhone";
        new ArrayList<Contact>();
    }

    public void printAbout(){
        System.out.println(
                "Модель: " + model + "\n"
        );
    }

    public void fillBalance(Integer money){
        if(money > 0) {
            simCard.setBalance(money);
        }
    }

    public void checkBalance(){
        System.out.println("Баланс Вашего телефона: " + simCard.getBalance());
    }

    public void newContact(String name, String surname, Integer Phone){
        Contact contact = new Contact(name, surname, Phone);
        bookContact.add(contact);
    }

    public void randomCall(){
        for(int i = 0; i < bookContact.size(); i++) {
            if(bookContact.get((int)Math.random() * bookContact.size()).getNumber() == simCard.getNumber());
            while(simCard.getBalance() > 0) {
                simCard.setBalance(-simCard.getPriceMinute());
            }
        }

    }

    public void printContacts(){
        for(int i = 0; i < bookContact.size(); i++) {
            bookContact.get(i).printAbout();
        }
    }
}

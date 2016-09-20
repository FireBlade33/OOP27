package lesson3;

public class PhoneTest {
    public static void main(String[] args) {
        SimCard sim = new SimCard("Киевстар", 964229019);
        sim.printAbout();

        Phone phone = new Phone(sim);
        phone.printAbout();

        phone.fillBalance(50);
        phone.checkBalance();
        phone.fillBalance(-15);
        phone.checkBalance();
        phone.fillBalance(35);
        phone.checkBalance();

        phone.printContacts();


    }
}

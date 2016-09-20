package lesson3;



public class SimCard {

    private String operator;
    private Integer balance;
    private Integer priceMinute;
    private Integer number;

    public SimCard(String operator, Integer number){
        this.operator = operator;
        balance = 0;
        priceMinute = 1;
        this.number = number;
    }

    public void printAbout(){
        System.out.println(
                "Оператор: " + operator + "\n" +
                "Номер телефона: " + number + "\n"
        );
    }

    public Integer getBalance(){
        return balance;
    }

    public void setBalance(Integer balance){
        this.balance += balance;
    }

    public Integer getPriceMinute(){
        return priceMinute;
    }

    public Integer getNumber(){
        return number;
    }
}

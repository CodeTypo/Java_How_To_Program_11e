public class Salesman {

    private String name;
    private double money = 200;
    private double commission = 0.09;


    public Salesman(String name) {
        this.name = name;
    }

    public void sold(int amount, double value){
        money += amount * value;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}

public class Employee {

    private String name;
    private double hoursWorked;
    private double hourRate;

    public Employee(String name, double hourRate) {
        this.name = name;
        this.hourRate = hourRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double grossPay(){
        if(hoursWorked <= 40){
            return hoursWorked * hourRate;
        } else{
            double grossPay = 40 * hourRate + (hoursWorked - 40) * hourRate * 1.5;
            return grossPay;
        }

    }

}

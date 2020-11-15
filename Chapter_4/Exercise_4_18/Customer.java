public class Customer {

    private int accNumber;
    private int balance;
    private int allItems;
    private int totalCredits;
    private int creditLimit;

    public Customer(int accNumber, int balance, int allItems, int totalCredits, int creditLimit) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.allItems = allItems;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAllItems() {
        return allItems;
    }

    public void setAllItems(int allItems) {
        this.allItems = allItems;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}

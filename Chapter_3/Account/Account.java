public class Account{

	private String name;
	private double balance;
	
	
	public Account(String name, double balance){
		this.name = name;
		if( balance > 0){
			this.balance = balance;
		}
	}
	
	public void withdraw(double withdrawAmount){
		if(withdrawAmount > 0 && withdrawAmount <= balance){
			this.balance -= withdrawAmount;
		}else{
			System.out.println("Withdrawal amount exceeded account balance");
		}
	}
	
	
	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance += depositAmount;
		}
	}
	
	public void setName(String name){
	this.name = name;
	}
	
	public String getName(){
	return name;
	}
	
	public double getBalance(){
		return balance;
	}

}
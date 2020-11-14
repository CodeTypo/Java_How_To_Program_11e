public class HeartRates{

	private String firstName;
	private String lastName;
	private int dobDay;
	private int dobMonth;
	private int dobYear;
	
	public HeartRates(String firstName, String lastName, int dobD, int dobM, int dobY){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dobDay = dobD;
		this.dobMonth = dobM;
		this.dobYear = dobY;
	}
	
	public void getData(){
		System.out.printf("Patient details: %n%s %s, age: %d, born: %d/%d/%d %nMaximum heart rate: %.2f %nTarget heart rate range: 50.00 - %.2f",
		this.firstName, this.lastName, this.getAge(), this.dobDay, this.dobMonth, this.dobYear, this.maximumHR(),
		this.maximumHR() * 0.85);
	}
	
	public int getAge(){
		return 2020 - this.dobYear;
	}
	
	public double maximumHR(){
		return 220 - this.getAge();
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getDobDay(){
		return dobDay;
	}
	public int getDobMonth(){
		return dobMonth;
	}
	public int getDobYear(){
		return dobYear;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setDobDay(int dobD){
		this.dobDay = dobD;
	}
	
	public void setDobMonth(int dobM){
		this.dobMonth = dobM;
	}
	
	public void setDobYear(int dobY){
		this.dobYear = dobY;
	}

}
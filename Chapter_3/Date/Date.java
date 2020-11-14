public class Date{

	private int month;
	private int day;
	private int year;
	
	public Date(int m, int d, int y){
	this.month = m;
	this.day = d;
	this.year = y;
	}
	
	public void setMonth(int m){
	month = m;
	}
	
	public void setDat(int d){
	day = d;
	}
	
	public void setYear(int y){
	year = y;
	}
	
	public int getMonth(){
	return month;
	}
	
	public int getDay(){
	return day;
	}
	
	public int getYear(){
	return year;
	}
	
	public void displayDate(){
	System.out.printf("%d/%d/%d",month,day,year);
	}
	
}
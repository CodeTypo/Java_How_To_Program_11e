public class Invoice{
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNum, String desc, int quant, double ppi){
		this.partNumber = partNum;
		this.partDescription = desc;
		
		if(quant > 0){
			this.quantity = quant;
		} else {
			this.quantity = 0;
		}
		
		if(ppi > 0){
			this.pricePerItem = ppi;
		} else {
			this.pricePerItem = 0.0;
		}
		
	}
	
	
	public String getPartNumber(){
		return partNumber;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getPricePerItem(){
		return pricePerItem;
	}
	
	
	public void setPartNumber(String partNum){
		this.partNumber = partNum;
	} 
	
	public void setPartDescription(String desc){
		this.partDescription = desc;
	}
	
	public void setQuantity(int quant){
		if(quant >= 0){
		this.quantity = quant;
		}
	} 
	
	public void setPricePerItem(double ppi){
		if(ppi >= 0){
		this.pricePerItem = ppi;
		}
	} 
	
	
	
	
	
	

}
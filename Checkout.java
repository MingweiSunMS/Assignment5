
import java.util.*;

public class Checkout {

	private Vector<DessertItem> dessertItemVector;
	
	public Checkout() {
		dessertItemVector=new Vector<>();
	}
	
	public int numberOfItems() {
		return dessertItemVector.size();
	}
	
	public void enterItem(DessertItem dessertItem) {
		dessertItemVector.add(dessertItem);
	}
	
	public void clear() {
		dessertItemVector.clear();
	}
	
	public int totalCost() {
		int totalCost=0;
		for(DessertItem dessertItem:dessertItemVector) {
			totalCost+=dessertItem.getCost();
		}
		return totalCost;
	}
	
	public int totalTax() {
		double tax=new DessertShoppe().TAX_RATE;
		return (int)(this.totalCost()*tax);
	}
	
	@Override
	public String toString() {
		String line1=new DessertShoppe().STORE_NAME;
		String line2="------------------------------";
		String line3="";
		for(DessertItem dessertItem:dessertItemVector) {
			line3+=dessertItem.toString()+'\n';
		}
		String line4="Tax"+'\t'+new DessertShoppe().cents2DollarAndCent(this.totalTax());
		String line5="Total Cost"+'\t'+new DessertShoppe().cents2DollarAndCent(this.totalCost());
		return line1+"\n"+line2+"\n"+line3+'\n'+line4+'\n'+line5;
		
	}
}

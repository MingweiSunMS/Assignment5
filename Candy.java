
public class Candy extends DessertItem{
	
	private double weight,pricePerPound;
	
	public Candy(String name, double weight, double pricePerPound) {
		super(name);
		this.weight=weight;
		this.pricePerPound=pricePerPound;
	}
	
	public int getCost() {
		return (int)Math.round(this.weight*this.pricePerPound);
	}
	
	@Override
	public String toString() {
		return this.getName()+"\t"+new DessertShoppe().cents2DollarAndCent(this.getCost())+'\n'+this.weight+"\t@\t"+new DessertShoppe().cents2DollarAndCent(this.pricePerPound);
	}
	
}

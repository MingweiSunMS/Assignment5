
public class Sundae extends IceCream{

	private String toppingName;
	private int toppingPrice;
	
	public Sundae(String IceCreamName, int icePrice, String toppingName, int toppingPrice) {
		super(IceCreamName,icePrice);
		this.toppingName=toppingName;
		this.toppingPrice=toppingPrice;
	}
	
	public int getCost() {
		return super.getCost()+this.toppingPrice;
	}
	
	@Override
	public String toString() {
		return this.toppingName+" with \n" +super.getName()+'\t'+new DessertShoppe().cents2DollarAndCent(this.getCost());
	}
}

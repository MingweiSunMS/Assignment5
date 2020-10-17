
public class IceCream extends DessertItem{
	
	private int price;
	
	public IceCream(String name, int price) {
		super(name);
		this.price=price;
	}
	
	public int getCost() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return this.getName()+'\t'+new DessertShoppe().cents2DollarAndCent(this.getCost());
	}
}

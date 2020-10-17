
public class Cookie extends DessertItem {

	private int numberOfCookies;
	private int pricePerDz;

	public Cookie(String name, int numberOfCookies, int pricePerDz) {
		super(name);
		this.numberOfCookies = numberOfCookies;
		this.pricePerDz = pricePerDz;
	}

	public int getCost() {
		return Math.round((pricePerDz * numberOfCookies) / 12);
	}

	@Override
	public String toString() {
		return this.getName() + '\t' + new DessertShoppe().cents2DollarAndCent(this.getCost()) + '\n'
				+ this.numberOfCookies + "\t@\t" + new DessertShoppe().cents2DollarAndCent(this.pricePerDz) + "/dz";
	}

}

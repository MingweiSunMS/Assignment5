
public abstract class DessertItem {
	
	private String name;
	
	public DessertItem() {}
	
	public DessertItem(String dessertName) {
		this.name=dessertName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract int getCost();
	
}


public abstract class Stock {
	double price;
	boolean isAvailable;
	public Stock(double price ,boolean isAvailable) {
	
		this.price=price;
		this.isAvailable = isAvailable;
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	

}

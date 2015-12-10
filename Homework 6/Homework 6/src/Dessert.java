
public class Dessert extends Stock{

	double sugar;
	double fat;
	public double getSugar() {
		return sugar;
	}
	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	public Dessert(double price ,boolean isAvailable,double sugar , double fat) {
		super(price,isAvailable);
		this.sugar=sugar;
		this.fat = fat;
	}
	
}

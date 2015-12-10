
public class Fruit extends Stock {
	double GMO;
	double vitamins;
	public Fruit(double price , boolean isAvailable , double GMO , double vitamins){
		super(price,isAvailable);
		this.GMO = GMO;
		this.vitamins = vitamins;

	}
	public double getGMO() {
		return GMO;
	}
	public void setGMO(double gMO) {
		GMO = gMO;
	}
	public double getVitamins() {
		return vitamins;
	}
	public void setVitamins(double vitamins) {
		this.vitamins = vitamins;
	}
	
}

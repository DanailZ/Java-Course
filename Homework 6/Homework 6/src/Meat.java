
public class Meat extends Stock {
	
	String type;
	double proteins;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getProteins() {
		return proteins;
	}
	public void setProteins(double proteins) {
		this.proteins = proteins;
	}
	public Meat(double price , boolean isAvailable,String type , double proteins) {
	super(price , isAvailable);
	
	}
	
}

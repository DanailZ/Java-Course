
public class Drinks extends Stock{
	String type;
	double H2O;
	
	public Drinks(double price ,boolean isAvailable,String type , double H2O) {
    super(price,isAvailable);
    
    this.type = type;
    this.H2O = H2O;	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getH2O() {
		return H2O;
	}

	public void setH2O(double h2o) {
		H2O = h2o;
	}
	
	

}

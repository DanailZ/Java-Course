
public class Vegetable extends Stock{
	 double carbohydrates;
	 double Ca;
	 
	 public Vegetable(double price ,boolean isAvailable , double carbohydrates,double Ca) {
		 super(price , isAvailable);
		 this.carbohydrates = carbohydrates;
		 this.Ca = Ca;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getCa() {
		return Ca;
	}

	public void setCa(double ca) {
		Ca = ca;
	}
	
	
	}



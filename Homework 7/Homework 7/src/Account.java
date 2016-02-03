
public class Account {

	private double cashamount ;
	
	public Account(double cashamount) {
		super();
		this.cashamount=cashamount;	
	}

	public double getCashamount() {
		return cashamount;
	}

	public void setCashamount(double cashamount) {
		this.cashamount = cashamount;
	}
	
	public void setAmount(double cashamount) throws NegativeMoneyException {
		if(cashamount < 0){
			throw new NegativeMoneyException("The amont you want to add is negative.");
		}
		this.cashamount = cashamount;
	}

}

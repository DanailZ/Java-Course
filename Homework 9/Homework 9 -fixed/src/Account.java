import java.*;

public class Account {

	private double price;

	public double getPrice() {
		return price;
	}
public Account(double price) throws NegativeMoneyException {
	
	if(price < 0 ){
		throw new NegativeMoneyException();
		
	}else{
		this.price=price;
	}
}
	
	public String checkIf(Object obj) throws InvalidAccountException{
		if(obj instanceof Account){
			if(obj instanceof PersonalAccount){
				return ((PersonalAccount) obj).getEGN();
			}else if (obj instanceof CoorporativeAccount){
				return ((CoorporativeAccount) obj).getBulstat();
				
			}else{
				return null;
			}
		}else 
			throw new InvalidAccountException();
			
		}
	
	public void setPrice(double price) {
		this.price = price;
	}

	class PersonalAccount extends Account {
		public PersonalAccount(double price) throws NegativeMoneyException {
			super(price);
			// TODO Auto-generated constructor stub
		}

		private String name;
		private String EGN;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEGN() {
			return EGN;
		}

		public void setEGN(String eGN) {
			EGN = eGN;
		}

	}

	class CoorporativeAccount extends Account {
		public CoorporativeAccount(double price) throws NegativeMoneyException {
			super(price);
			// TODO Auto-generated constructor stub
		}

		private String firmName;
		private String bulstat;

		public String getFirmName() {
			return firmName;
		}

		public void setFirmName(String firmName) {
			this.firmName = firmName;
		}

		public String getBulstat() {
			return bulstat;
		}

		public void setBulstat(String bulstat) {
			this.bulstat = bulstat;
		}

	}
	class InvalidAccountException extends Exception{
		public InvalidAccountException() {
			
		}
		@Override
		public String getMessage() {
			return "Invalid Acccount";
			
			
		}
	}
	class NegativeMoneyException extends Exception{
		public NegativeMoneyException() {
			
		}
		@Override
		public String getMessage() {
			return "NegativeMoney";
			
			
		}
	}
	public static void main(String[]args){
		
		
	}
}

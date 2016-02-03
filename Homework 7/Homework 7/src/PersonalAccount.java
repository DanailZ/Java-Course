

public class PersonalAccount extends Account {
	
	private String Name ;
	private double EGN;
	public PersonalAccount(double cashamount,String Name , double EGN) {
		super(cashamount);
		this.Name=Name;
		this.EGN=EGN;
	
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getEGN() {
		return EGN;
	}
	public void setEGN(double eGN) {
		EGN = eGN;
	}

	
	public double InvalidAccount(PersonalAccount obj)throws InvalidAccountException{
		if(obj instanceof Account){
			System.out.println("The EGN of the person is:"+obj.getEGN());
			return obj.getEGN();
		}else{
			throw new InvalidAccountException("Invalid person account");
		}
		}
		
	}




public class CoorporativeAccount extends Account {

   private String CompanyName;
   private String Bulstat ;
	public CoorporativeAccount(double cashamount,String CompanyName,String Bulstat) {
		super(cashamount);
		this.CompanyName=CompanyName;
		this.Bulstat=Bulstat;
		
		
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getBulstat() {
		return Bulstat;
	}
	public void setBulstat(String bulstat) {
		Bulstat = bulstat;
	}
   public String InvalidAccount(CoorporativeAccount obj)throws InvalidAccountException{
	   if(obj instanceof Account){
		   System.out.println("The bulstat of the company is:"+ obj.getBulstat());
		   return obj.getBulstat();
	   }else{
		  throw new InvalidAccountException("Invalid CoororativeAccount.");
		  
	   }
   }
}

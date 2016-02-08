package RemoteSystemsTempFiles;
import java.*;
public class Town {
     public  String Townname;
     public String country;
     public long population;
     public Town(String Townname,String country ,long population) {
		  
    	 this.Townname=Townname;
    	 this.country=country;
    	 this.population=(long) population;
    	 
	}
	public String getTownname() {
		return Townname;
	}
	public void setTownname(String townname) {
		Townname = townname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = (long) population;
	}
    

}

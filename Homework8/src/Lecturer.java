
public class Lecturer extends Person {

	private String Math;
	
	//public Lecturer() {
	  // super(Math, Math, YearsServese);
//	}

	public Lecturer(String Name, String ThirdName, int YearsServese,String Math) {
		super(Name, ThirdName, YearsServese);
		
	}

	public String getMath() {
		return Math;
	}

	public void setMath(String math) {
		Math = math;
	}
	
	

}

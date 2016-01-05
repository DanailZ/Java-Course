
public abstract class Person {
 private String Name;
 private String ThirdName;
 private int YearsServese;
 
 public Person(String Name,String ThirdName,int YearsServese) {
	 super();
	 this.Name=Name;
	 this.ThirdName=ThirdName;
	 this.YearsServese=YearsServese;
	 
	 
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getThirdName() {
	return ThirdName;
}

public void setThirdName(String thirdName) {
	ThirdName = thirdName;
}

public int getYearsServese() {
	return YearsServese;
}

public void setYearsServese(int yearsServese) {
	YearsServese = yearsServese;
}
 
 
}

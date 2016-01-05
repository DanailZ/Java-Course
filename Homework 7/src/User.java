
public class User {
	public String Email;
	public String password;
	
  public User(){
	  
  }
  public User(String Email , String password){
	  this.Email=Email;
	  this.password=password;
  }

public String getEmail() throws Exception {
	setEmail(Email);
	setPassword(password);
	 
	return Email;
}

public void setEmail(String email) {
	Email = email;
	
	if(Email.length()<5 &&Email.contains("@")){
		System.out.println("your email adress has less then 5 symbols of a missin"+ "@");
	}else{
			System.out.println("you can enter");
		}
	}


public String getPassword() {
	return password;
}

public void setPassword(String password) throws Exception {
	this.password = password;
	if(password.length()>6 && containDigit(password)){
		this.password=password;
	}else{
		throw new Exception("Invalid username");
	}
	
	}
private boolean charContain(String str , char c){
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==c){
			return true;
		}
		return false;
		}
	}


private boolean containDigit(String str){
	for (int i = 0; i < str.length(); i++) {
		switch(str.charAt(i)){
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			return true;
		}
	}
				return false;
		}
		
	}


	



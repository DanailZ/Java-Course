
public class ConverterTemp {
	
	
	public static void main (String[] args){
		ConverterTemp conv = new ConverterTemp(25);
		
	}
public ConverterTemp(double celsium) {
	
	System.out.println("Fahrenheit: "+ ((celsium*9/5 +32)));
}
}

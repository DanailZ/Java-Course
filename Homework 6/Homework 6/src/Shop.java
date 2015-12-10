import java.util.Scanner;

public abstract class Shop {
	String name,adress;
	Stock[]arr = new Stock[21];
	
	public void addProduct(){
		arr[0] = new Fruit(150,true,300,400);
		System.out.println("Available: "+isDepleted(arr[0]));
	}
	
	public boolean isDepleted(Stock arr){
		if(arr.isAvailable()){
			return false;
		}else{
			return true;
		}
	}
}



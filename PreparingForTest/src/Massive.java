import java.*;
public class Massive {
	public static void main(String[]args){
	int[] number = {3,2,6,7,1,3,5};
	int[] numbertwo  ={4,1,2,7,8,9,5};
	
    for (int i = 0; i < number.length; i++) {
    	for (int j = 0; j < numbertwo.length; j++) {
			if(number[i]==numbertwo[j]){
				System.out.print(number[i]);
			}
		}
	
	}
	}

}

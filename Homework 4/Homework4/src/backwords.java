
public class backwords {

	public static void main(String[] args) {
	int [] a = new int [30];
	
	for (int i = 0; i < a.length; i++) {
		a[i] = a.length - i ;
	
	} 
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] +  " ");
		if(a[i]==6 || a[i]==12 || a[i]==18 || a[i]==24){
		System.out.println();
		}
	}
		
	}

}

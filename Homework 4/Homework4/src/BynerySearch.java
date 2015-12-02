
public class BynerySearch {

	public static void main(String[] args) {
		
		int[] a = {12,25,34,46,55,67,88,89,90,99};
		int key = 89;
		
		
		 int lower=0;
		 int bigger = a.length;
		 int middle = (lower + bigger)/2;
		 while (a[middle] !=key){
		 
			 if(a[middle]< key){
				middle =(middle+bigger)/2;
			 }
			 else if (a[middle]> key){
				 middle=(lower+middle)/2;
		}
			 System.out.println("the index of the number is :"+ middle);
 	}

	}}

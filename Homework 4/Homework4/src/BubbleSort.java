
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {6,2,8,4,3,8};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i -1; j++) {
				if(a[j] > a[j+1]){
					int c = a[j];
					a[j]=a[j+1];
					a[j+1]= c;			
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}

	}

}

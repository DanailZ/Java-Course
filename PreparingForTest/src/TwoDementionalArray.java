import java.*;
public class TwoDementionalArray {
   public static void main(String[]args){
	   
	   int[][] myarr = new int [10][10];
	    int b =1 ;
	    int min = 100;
	    int max = 0;
	    int index = 0;
	    int index2=0;
	    int index3 =0;
	    int index4=0;
	    
	    for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr.length; j++) {
				myarr[i][j] = b++;	
			}	
	    }
	    for (int i = 0; i < myarr.length; i++) {
	    	for (int j = 0; j < myarr[i].length; j++) {
    		if(myarr[i][j]<min){
    		min = myarr[i][j];
    		index=i;
    		index=j;
    		}

			}
	
		}
	    System.out.println("Minimun" + min +" "+ index +" "+ index2);

   }
}


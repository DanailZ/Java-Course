import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   
   System.out.println(" Enter the points from the game:");
     
   int a = sc.nextInt();
   
   if ( a >=1 && a<=3){
	   a=a*5;
	   System.out.println("Your points are:"+a);
	   
   }else if (a >=4 && a<=6){
	   a=a*10;
	   System.out.println("your points are:"+a);
	   
   }else if( a >=7 && a <=9){
	   a=a*50;
	   System.out.println("Your points are :"+a);
	   
   }else {
	   System.out.println("Your numbers are out of range:");
   }
   sc.close();
	}
    
}

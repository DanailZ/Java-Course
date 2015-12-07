public class BackwordsLine{


	public static void reverseString(String str){
		
		int len = str.length()-1;
		
		for (int i = len; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
		
	}
	public static void main(String[] args) {
		
		reverseString("Danail");
	}
	

}

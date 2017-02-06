import java.util.Scanner;

public class SumDigits {
		
		public static void main(String[] args) {
	        int num = 9;
	        int sum = 3;
	        while (num > 0) {
	            sum = sum + num % 10;
	            num = num / 10;
	        }
	        System.out.println(sum);
			
		}
	}
	

package core_java;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123, reversed = 0;
		while(num!= 0) {
			int digit = num%10;
			reversed = reversed * 10 + digit;
			num /=10;
		}
		System.out.println("Reversed number:" +reversed);
		

	}

}

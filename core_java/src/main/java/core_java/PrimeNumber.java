package core_java;

public class PrimeNumber {
 public static void main(String[] args) {
	 int num=17;
		boolean flag = false;
		for(int i=2; i<=num / 2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("prime");
		else 
			System.out.println("not prime");
 }
}

package core_java;

public class Fibinocci {
	public static void main(String[] args) {

		int n = 8,t,t1=0,t2=1;
		int i = 1;
	   System.out.println(t1);
	   System.out.println(t2);
		while(i < n) {
			t = t1 +t2;
			System.out.println(t);
			t1 = t2;
			t2 = t;
			i++;
		}
		
   }

}


package core_java;

public class Switch_Case {

	public static void main(String[] args) {
		int marks=76;
		int mm=4;
		
		if(marks>60) {
			//System.out.println("First Division");
			mm=1;
		}
		else {
			if(marks>=45  && marks<60) {
				//System.out.println("Second Division");
				mm=2;
				
			}
			else {
				if(marks>=33  && marks<45) {
					//System.out.println("Third Division");
					mm=3;
				}
				else {
					//System.out.println("Fail");
					mm=4;
				}
			}
		}

	
switch(mm) {
case 1 : System.out.println("First Division");
break;
case 2 : System.out.println("Second Division");
break;
case 3 : System.out.println("Third Division");
break;
case 4 : System.out.println("Fail");
break;
default : System.out.println("Invalid choice");
}

}

}


package myNewPackage;

public class QaCourse {
	
	
int age = 0;
	
	public  void WelcomeMsg(String name ) {
		System.out.println("welcome "+name);
	}

	public static void main(String[] args) {

		QaCourse obj = new QaCourse(); 
		obj.WelcomeMsg("zaid");
		
		
		obj.WelcomeMsg("dania2");
		
		
	}

}

package myNewPackage;

public class JavaClassSumaya {

	static final int finalScore = 100 ; 
	
	static void welcomeMsg () {
		System.out.println("mar7ba ya 7lwen khalena nt2akd men el soot");
	}
	
	public void didYouCreateTheGithubAccount(boolean created,String name) {
		
		if(created) {
			System.out.println("thank you "+name);
		}else {
			System.out.println("why you didnt do it "+ name);
		}
	}


	public static void main(String[] args) {
		
		welcomeMsg(); 
		 
		
		JavaClassSumaya Student1 = new JavaClassSumaya();
		
		Student1.didYouCreateTheGithubAccount(false, "dania");
		
		JavaClassSumaya student2 = new JavaClassSumaya();
		student2.didYouCreateTheGithubAccount(true, "zaid");
		
		JavaClassSumaya Student3 = new JavaClassSumaya(); 
		Student3.didYouCreateTheGithubAccount(true, "Nancy");
	}

}

package myNewPackage;

 abstract class EncapsulationINJAVA {
	


	
public abstract void study ();
public abstract void read() ; 
 }

class Haneen extends EncapsulationINJAVA {
	public int YearOFJavaCourse = 2024 ; 
	String name = "haneen"; 
	
	int age = 23 ; 
	
	public void study() {
		System.out.println("study well");
	}
	public void read() {
		System.out.println("read very fast");
	}
	
}


class omar extends EncapsulationINJAVA {
	public int YearOFJavaCourse = 2024 ; 
	String name = "omar"; 
	
	int age = 24 ; 
	
	public void study() {
		System.out.println("study  very bad ");
	}
	public void read() {
		System.out.println("read very fast");
	}
	
}

class zaid extends EncapsulationINJAVA {
	public int YearOFJavaCourse = 2024 ; 
	String name = "zaid"; 
	
	int age = 23 ; 
	
	public void study() {
		System.out.println("study  very very well");
	}
	public void read() {
		System.out.println("read very normal ");
	}
	
}

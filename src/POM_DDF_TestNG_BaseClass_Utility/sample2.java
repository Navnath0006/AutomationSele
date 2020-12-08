package POM_DDF_TestNG_BaseClass_Utility;

public class sample2 extends sample1{

	
	public static void main(String[] args) {
		sample2 s2=new  sample2();
		s2.TC2();
	}
	
	public void TC2() {
		TC1();
		System.out.println("running TC2");
	}
}

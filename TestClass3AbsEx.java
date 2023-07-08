package com.rohit.javaapp;


abstract class AbsClass{

	abstract void absMethod();
}


class SubClass extends AbsClass{


	void absMethod(){
		System.out.println("implementation of abstract method ");
	}
	void myMethod(){
		System.out.println("implementation of my method");
	}

}

public class TestClass3AbsEx{
	public static void main(String [] args){

		//AbsClass objr = new SubClass();
	//	objr.absMethod();
		//objr.myMethod();

		/*SubClass objr1 = new SubClass();  //downcasting
		objr1.absMethod();
		objr1.myMethod();*/

		SubClass sobjr = new SubClass();
		AbsClass aobjr = (AbsClass)sobjr;
		aobjr.absMethod();
		//aobjr.myMethod();   //???????
		((SubClass) aobjr).myMethod();


	}
}
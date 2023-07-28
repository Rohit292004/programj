/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TestClassException {
	public static void main(String[] args) {
		//multiple exception
		Scanner sobjr=new Scanner(System.in);
		System.out.println("Enter two values");
		try {
			int num1=sobjr.nextInt();
			int num2=sobjr.nextInt();
			System.out.println("Division="+num1/num2);
		} catch (Exception e) {
			 e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.getMessage());
		}


		System.out.println("End of program");

	}
}
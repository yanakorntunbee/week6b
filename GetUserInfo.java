package week6b;

import java.util.Scanner;
public class GetUserInfo {
	public static void main(String[]args) {
		String name;
		int age ;
		Scanner inputHeeton = new Scanner(System.in); 
		System.out.print("please enter your name >> ");
		name = inputHeeton.nextLine();
		System.out.print("Please enter your age >> ");
		age =  inputHeeton.nextInt();
		System.out.print("Your name is >> " + name + " and you are " + age + "year old.");
	}
}

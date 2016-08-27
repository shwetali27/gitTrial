/*
file name: HelloWorld.java
Created by: Shwetali
Created Date: 27-08-16
purpose: Standard coding conversition to create java files
*/

package com.bridgelabz.demo;
import java.util.Scanner;
class HelloWorld{
	private String mUserName;//User name input for HelloWorld
	HelloWorld(String userName){
		mUserName = userName;
	}

	//this function is for printing Hello World with user name
	public void printUserName(){
		System.out.println("Hello World "+mUserName);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter User Name: ");
		String userName = sc.nextLine();
		HelloWorld hw = new HelloWorld(userName);
		hw.printUserName();
		
	}
}

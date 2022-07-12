package com.aanchal.clieant;

import java.util.Scanner;

import com.aanchal.presentation.Presentation;
import com.aanchal.presentation.PresentationImpl;

public class Client {

	public static void main(String[] args) {
		Presentation employeePresentation=new PresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
	
		}

	}

}

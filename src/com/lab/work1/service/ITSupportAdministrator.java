package com.lab.work1.service;
import java.util.Scanner;
import  com.lab.work1.Employee;
import  com.lab.work1.service.CredentialService;

public class ITSupportAdministrator {
	public static void main(String[] args) {
		Employee e=new Employee("Harshit","Choudhary");
		CredentialService cs= new CredentialService();
		String newEmail="";
		char[] newPassword;
		System.out.println("Please enter code of the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resoucre");
		System.out.println("4. Legal");
		Scanner sc=new Scanner(System.in);
		int optionValue = sc.nextInt();
		
		if(optionValue==1) {
			newEmail=cs.generateEmailAddress(e.getFirstName(),e.getLastName(),"tech");
			newPassword=cs.generatePassword();
			cs.showCredentials(e.getFirstName(),newEmail,newPassword);
		} else if(optionValue==2) {
			newEmail=cs.generateEmailAddress(e.getFirstName(),e.getLastName(),"admin");
			newPassword=cs.generatePassword();
			cs.showCredentials(e.getFirstName(),newEmail,newPassword);
		} else if(optionValue==3) {
			newEmail=cs.generateEmailAddress(e.getFirstName(),e.getLastName(),"hr");
			newPassword=cs.generatePassword();
			cs.showCredentials(e.getFirstName(),newEmail,newPassword);
		} else if(optionValue==4) {
			newEmail=cs.generateEmailAddress(e.getFirstName(),e.getLastName(),"legal");
			newPassword=cs.generatePassword();
			cs.showCredentials(e.getFirstName(),newEmail,newPassword);
		} else {
			System.out.println("You have selected invalid option");
		}
		

	}
}



package com.lab.work1.service;

import java.util.Random;

public class CredentialService {
	char[] generatePassword(){
		String cl="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String sl="abcdefghijklmnopqrstuvwxyz";
		String num="1234567890";
		String sp ="!@#$%^&*?></.+-()";
		String val=cl+sl+num+sp;
		Random rm=new Random();
		char[] newPassword= new char[8];
		for(int i=0;i<newPassword.length;i++) {
			newPassword[i]=val.charAt(rm.nextInt((val.length())));
		}
		return newPassword;
	}
	String generateEmailAddress(String firstname,String lastname,String option){
		return firstname+lastname+"@"+option+".abc.com";
	}
	void showCredentials (String firstName,String newEmail,char[] newPassword){
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email        --->  "+newEmail);
		System.out.println("Password        --->  "+newPassword);
	}
}

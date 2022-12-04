package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;

public class CredentialsService implements ICredentials {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		String atSymbol="@";
		String emailAddress=firstName+lastName+atSymbol+department+"."+"gl.com";
		//johnandrew@adm.gl.com
		return emailAddress;
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String specialChar="!@#$%^&*(){}[]";
		
		String all=upperCase+lowerCase+num+specialChar;
		
		Random random=new Random();
		String password="";
		
		for(int i=0;i<8;i++) {
			int boundValue=all.length(); //70
			int randomIndex=random.nextInt(boundValue); //returns some random number between 0 and 70
			char randomChar=all.charAt(randomIndex);//
			password+=String.valueOf(randomChar);
		}
		return password;
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		//welcome message 
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are : ");
		System.out.println("Email ID : "+employee.getEmail());
		System.out.println("Password : "+employee.getPassword());
		
		
	}



}

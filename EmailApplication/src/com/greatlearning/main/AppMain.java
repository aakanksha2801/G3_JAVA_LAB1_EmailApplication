package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entry point to the application
		//user input options for departments
		
		Employee demoEmployee=new Employee("Aakanksha","Sharma");
		ICredentials credentialsService=new CredentialsService();
		
		//user input options for departments
		System.out.println("Please enter the department from the following options: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		Scanner userInput=new Scanner(System.in);
		int option=userInput.nextInt();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		switch(option) {
			case 1:{
				//dept is technical , short form tech
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"tech");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			
			case 2:{
				//dept is admin , short form adm
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"adm");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			
			case 3:{
				//dept is Human Resources , short form hr
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),demoEmployee.getLastName().toLowerCase(),"hr");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			
			case 4:{
				//dept is legal , short form lg
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLastName(),"lg");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			
			default: {
				System.out.println("Enter a valid department");
				
			}
			
		}
		
		demoEmployee.setEmail(generatedEmail);
		demoEmployee.setPassword(generatedPassword);
		credentialsService.showCredentials(demoEmployee);

		
		

	}
	
	
}

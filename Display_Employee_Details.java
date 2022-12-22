package mainMethod;

import interfaces.Employee_Credentials;
import model.Employee;
import credentials.Credential_service;

import java.util.Scanner;

public class Display_Employee_Details {

	public static void main(String[] args) {
		Employee employee= new Employee("harshit","choudary");


		Employee_Credentials obj1=new Credential_service();

		Scanner obj2= new Scanner(System.in);

		int key;

		String generatedEmail=null;

		System.out.println("Enter the Department from the below choice");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		System.out.println("0.exit");



		do {
			key =obj2.nextInt();


			switch (key) {

			case 0:{
				System.out.println("exited successfully");

				break ;
			}

			case 1:{
				System.out.println("Your Credentials are as follows\n");
				generatedEmail=obj1.generateEmailAdress(employee.getFirstName(),employee.getLastName(),"tech");
				System.out.println("Email:"+generatedEmail);
				obj1.generatePassWord();
				System.out.println();
				break ;
			}
			case 2:{
				System.out.println("Your Credentials are as follows");
				generatedEmail=obj1.generateEmailAdress(employee.getFirstName(),employee.getLastName(),"adm");
				System.out.println("Email:"+generatedEmail);

				obj1.generatePassWord();
				System.out.println();
				break;
			}
			case 3:{
				System.out.println("Your Credentials are as follows\n");
				generatedEmail=obj1.generateEmailAdress(employee.getFirstName(),employee.getLastName(),"HR");
				System.out.println("Email:"+generatedEmail);

				obj1.generatePassWord();
				System.out.println();
				break;
			}
			case 4:{
				System.out.println("Your Credentials are as follows\n");
				generatedEmail=obj1.generateEmailAdress(employee.getFirstName(),employee.getLastName(),"Lgl");
				System.out.println("Email:"+generatedEmail);

				obj1.generatePassWord();
				System.out.println();
				break;
			}
			default :{
				System.out.println("valid choices are 1 to 4");
				System.out.println();
				break;
			}

			}
		} while (key!=0);

		obj2.close();
	}
}

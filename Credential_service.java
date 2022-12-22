package credentials;

import java.util.Random;

import interfaces.Employee_Credentials;
import model.Employee;

public class Credential_service implements Employee_Credentials  {
	@Override
	public String generateEmailAdress(String firstName,String lastName,String department) {
		return firstName+lastName+"@"+department+".gl.com";
	}
	@Override	
	public  void showcredential(Employee employee) {

		System.out.println("Your Name:"+employee.getFirstName()+""+employee.getLastName());
		System.out.println("Your Credentials Are ");
		System.out.println("Email:"+employee.getEmail());
		System.out.println("Password:"+employee.getPassWord());
	}
	@Override
	public void  generatePassWord() {
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String specialCharacter="!@#$%^&*()_<>?{}";
		String num ="1234567890";
		String combination=upperCase+lowerCase+specialCharacter+num;
		int len=8;

		char[] passWord=new char[len];

		Random r=new Random();

		for(int i=0;i<len;i++) {
			passWord[i]=combination.charAt(r.nextInt(combination.length()));

		}
		System.out.println("generated password is:"+new String(passWord));

	}
	

}




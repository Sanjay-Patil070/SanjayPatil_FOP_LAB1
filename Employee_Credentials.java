package interfaces;

import model.Employee;

public interface Employee_Credentials {
	public String generateEmailAdress(String firstName,String lastName,String department);
	public void generatePassWord();
	public void showcredential(Employee employee);
}

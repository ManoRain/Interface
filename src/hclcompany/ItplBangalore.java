package hclcompany;

public class ItplBangalore implements SubBranchChennai, MainBranchJigani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ItplBangalore obj=new ItplBangalore();
		obj.employeeCount();
		obj.employeecountofMale();
		obj.employeecountofFemale();
		obj.employeeMinimumSalary();
		obj.employeeMaximumSalary();
		obj.idCard();
		obj.formals();
	}
		



	@Override
	public void employeeCount() {
		// TODO Auto-generated method stub
		System.out.println("Employee Count is 9300");

	}

	@Override
	public void employeecountofMale() {
		// TODO Auto-generated method stub
		System.out.println("Male Employee Count is 4800");

	}

	@Override
	public void employeecountofFemale() {
		// TODO Auto-generated method stub
		System.out.println("Female Employee Count is 4500");

	}

	@Override
	public void employeeMinimumSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Minimum Salary is 32000.00 RS");

	}

	@Override
	public void employeeMaximumSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Maximum Salary is 100000.00 RS");

	}

	@Override
	public void idCard() {
		// TODO Auto-generated method stub
		System.out.println("Employees shold be wear ID Card before Entering Office");

		
	}

	@Override
	public void formals() {
		// TODO Auto-generated method stub
		System.out.println("Employees should come with Formals");

		
	}
}
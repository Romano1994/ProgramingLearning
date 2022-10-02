package salary.main;

import salary.service.SalaryService;

public class SalaryMain {
	public static void main(String[] args) {
		SalaryService salaryService = new SalaryService();
		salaryService.menu();
	}
}

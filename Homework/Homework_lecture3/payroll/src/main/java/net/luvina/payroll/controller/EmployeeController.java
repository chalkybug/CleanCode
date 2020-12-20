package net.luvina.payroll.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.luvina.payroll.model.Employee;
import net.luvina.payroll.service.EmployeeService;

@Controller
public class EmployeeController {

	@ResponseBody
	@GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String getEmployeesFromCSV() {
		try {
			EmployeeService employeeService = new EmployeeService();
			ArrayList<Employee> employees = employeeService.getEmployeesFromCSV();
			StringBuilder sb = new StringBuilder(); // sb dùng để cộng các chuỗi toString
			for (Employee employee : employees) {
				sb.append(employee.toString() + " Salary = "
						+ employeeService.calculatorSalary(employee.getStartdate(), employee.getSalary()) + "<br>");
			}
			return sb.toString();
		} catch (Exception e) {
			return "tra ve trang loi";
		}

	}

}
package net.luvina.payroll.controller;

import net.luvina.payroll.model.Employee;
import net.luvina.payroll.model.ModelInfo.EmployeeInfo;
import net.luvina.payroll.service.EmployeeService;
import net.luvina.payroll.service.SalaryService;
import net.luvina.payroll.utility.ConfigUtility;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class EmployeeController {

    @ResponseBody
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String getEmployeesFromCSV() {
        try {
            EmployeeService employeeService = new EmployeeService();
            SalaryService salaryService = new SalaryService();
            ArrayList<Employee> employees = employeeService.getEmployeesFromFile("employee.xlsx");
            StringBuilder sb = new StringBuilder(); // sb dùng để cộng các chuỗi toString
            for (Employee employee : employees) {
                EmployeeInfo info = new EmployeeInfo();
                info.start_date = employee.getStartdate();
                info.salary_origin = employee.getSalary();
                info.role = employee.getRole();
                sb.append(employee.toString() + " Salary = "
                        + salaryService.calculatorSalaryWithExpYear(info) + "<br>");
            }
            return sb.toString();
        } catch (Exception e) {
            return "Da co loi xay ra";
        }

    }

}
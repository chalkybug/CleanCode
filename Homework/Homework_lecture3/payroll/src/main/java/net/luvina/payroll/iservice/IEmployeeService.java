package net.luvina.payroll.iservice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import net.luvina.payroll.model.Employee;

public interface IEmployeeService {
	/**
	 * Lấy danh sách nhân viên từ CSV.
	 *
	 * @return danh sách nhân viên từ CSV.
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException           Signals that an I/O exception has occurred.
	 */
	public ArrayList<Employee> getEmployeesFromCSV() throws FileNotFoundException, IOException;

	/**
	 * Tính toán lương
	 *
	 * @param ngày  vào làm
	 * @param Lương gốc của nhân viên
	 * @return Lương hiện tại
	 */
	public int calculatorSalary(String date, int salary_origin);
}

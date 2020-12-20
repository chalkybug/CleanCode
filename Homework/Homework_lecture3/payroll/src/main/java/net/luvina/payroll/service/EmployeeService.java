package net.luvina.payroll.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import net.luvina.payroll.common.Common;
import net.luvina.payroll.constant.Constant;
import net.luvina.payroll.iservice.IEmployeeService;
import net.luvina.payroll.model.Employee;

public class EmployeeService implements IEmployeeService {

	/**
	 * Lấy danh sách nhân viên từ CSV.
	 *
	 * @return danh sách nhân viên từ CSV.
	 * @throws FileNotFoundException the file not found exception
	 * @throws IOException           Signals that an I/O exception has occurred.
	 */
	public ArrayList<Employee> getEmployeesFromCSV() throws FileNotFoundException, IOException {
		try {
			ArrayList<Employee> employees = new ArrayList<Employee>();
			File file = ResourceUtils.getFile("classpath:static/employee.csv");

			CsvMapper mapper = new CsvMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
			CsvSchema schema = CsvSchema.emptySchema().withHeader(); // Dòng đầu tiên sử dụng làm Header
			ObjectReader oReader = mapper.readerFor(Employee.class).with(schema); // Cấu hình bộ đọc CSV phù hợp với
																					// kiểu Car.class

			Reader reader = new FileReader(file);
			MappingIterator<Employee> mi = oReader.readValues(reader); // Iterator đọc từng dòng trong file
			while (mi.hasNext()) {
				Employee employye = mi.next();
				employees.add(employye);
			}
			return employees;
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}

	}

	/**
	 * Tính toán lương
	 *
	 * @param ngày  vào làm
	 * @param Lương gốc của nhân viên
	 * @return Lương hiện tại
	 */
	public int calculatorSalary(String date, int salary_origin) {
		int salary = salary_origin;
		int years_of_exp = Common.calculateYearsOfExperience(date);
		for (int i = 0; i < years_of_exp; i++) {
			salary += salary * Constant.NUMBER_SALARY;
			System.out.println(salary);
		}
		return salary;

	}

}

package net.luvina.payroll.service;

import net.luvina.payroll.Interface.IEmployeeService;
import net.luvina.payroll.Interface.IFile;
import net.luvina.payroll.factory.ReaderFactory;
import net.luvina.payroll.model.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeService implements IEmployeeService {

    public ArrayList<Employee> getEmployeesFromFile(String filename) throws FileNotFoundException,
            IOException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        IFile file = ReaderFactory.createReader(filename);
        employees = file.readFile(filename);
        return employees;
    }


}

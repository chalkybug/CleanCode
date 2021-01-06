package net.luvina.payroll.Interface;

import net.luvina.payroll.model.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface IFile {
    /**
     * Lấy danh sách nhân viên từ file.
     *
     * @return danh sách nhân viên từ file
     * @throws FileNotFoundException the file not found exception
     * @throws IOException           Signals that an I/O exception has occurred.
     */
    public ArrayList<Employee> readFile(String fileName) throws FileNotFoundException, IOException;

}

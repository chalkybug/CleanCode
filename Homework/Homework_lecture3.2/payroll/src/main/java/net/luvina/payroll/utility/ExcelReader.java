package net.luvina.payroll.utility;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import net.luvina.payroll.Interface.IFile;
import net.luvina.payroll.model.Employee;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader implements IFile {

    @Override
    public ArrayList<Employee> readFile(String fileName) throws FileNotFoundException, IOException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().addListDelimiter(";").build();
            File file = ResourceUtils.getFile(String.format("classpath:static/%s", fileName));
            List<Employee> lstEmployee = Poiji.fromExcel(file, Employee.class, options);
            for (Employee employee : lstEmployee) {
                employees.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return employees;
    }
}

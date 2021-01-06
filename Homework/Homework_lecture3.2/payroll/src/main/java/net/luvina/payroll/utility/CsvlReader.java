package net.luvina.payroll.utility;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import net.luvina.payroll.Interface.IFile;
import net.luvina.payroll.model.Employee;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;

public class CsvlReader implements IFile {


    @Override
    public ArrayList<Employee> readFile(String fileName) throws FileNotFoundException, IOException {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            File file = ResourceUtils.getFile(String.format("classpath:static/%s", fileName));

            CsvMapper mapper = new CsvMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
            CsvSchema schema = CsvSchema.emptySchema().withHeader(); // Dòng đầu tiên sử dụng làm Header
            ObjectReader oReader = mapper.readerFor(Employee.class).with(schema); // Cấu hình bộ đọc CSV phù hợp với

            Reader reader = new FileReader(file);
            MappingIterator<Employee> mi = oReader.readValues(reader); // Iterator đọc từng dòng trong file
            while (mi.hasNext()) {
                Employee employee = mi.next();
                employees.add(employee);
            }

        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
        return employees;
    }
}

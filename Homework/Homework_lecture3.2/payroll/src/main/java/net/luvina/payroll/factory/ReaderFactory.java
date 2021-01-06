package net.luvina.payroll.factory;

import net.luvina.payroll.Interface.IFile;
import net.luvina.payroll.utility.CsvlReader;
import net.luvina.payroll.utility.ExcelReader;

public class ReaderFactory {

    public static IFile createReader(String fileType) {
        if (fileType.contains(".csv")) {
            return new CsvlReader();
        } else if (fileType.contains(".xlsx")) {
            return new ExcelReader();
        } else {
            throw new IllegalArgumentException("This file type is unsupported");
        }


    }
}


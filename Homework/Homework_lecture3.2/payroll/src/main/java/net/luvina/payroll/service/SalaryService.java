package net.luvina.payroll.service;

import net.luvina.payroll.Abstract.SalaryServiceAbstract;
import net.luvina.payroll.model.ModelInfo.EmployeeInfo;

public class SalaryService extends SalaryServiceAbstract {

    @Override
    public int calculatorSalary(EmployeeInfo info) {
        return calculatorSalaryWithExpYear(info) + calculatorOTSalary(info) + calculatorBonusSalesSalary(info);
    }

}

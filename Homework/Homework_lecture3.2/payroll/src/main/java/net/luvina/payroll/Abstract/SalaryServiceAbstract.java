package net.luvina.payroll.Abstract;

import net.luvina.payroll.Enum.RankSalaryEnum;
import net.luvina.payroll.common.Common;
import net.luvina.payroll.model.ModelInfo.EmployeeInfo;

public abstract class SalaryServiceAbstract {
    /**
     * Tính lương theo năm kinh nghiệm và hệ số lương
     *
     * @param info Thông tin nhân viên
     * @return ngày tháng thập phân
     */
    public int calculatorSalaryWithExpYear(EmployeeInfo info) {
        int salary = info.salary_origin;
        int years_of_exp = Common.calculateYearsOfExperience(info.start_date);
        double rate_salary = Common.getRateSalary(info.role);

        for (int i = 0; i < years_of_exp; i++) {
            salary += salary * rate_salary;
        }
        return salary;

    }

    public int calculatorOTSalary(EmployeeInfo info) {
        return 0;

    }

    public int calculatorBonusSalesSalary(EmployeeInfo info) {
        return 0;
    }

    public abstract int calculatorSalary(EmployeeInfo info);
}

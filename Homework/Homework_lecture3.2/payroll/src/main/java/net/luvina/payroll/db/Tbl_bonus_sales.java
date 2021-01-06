package net.luvina.payroll.db;

import net.luvina.payroll.Enum.RankSalaryEnum;

import java.util.ArrayList;
import java.util.List;

public class Tbl_bonus_sales {
    // thay cho câu lệnh select trong db
    public static List<RankSalaryEnum> getLstBonusSales() {
        List<RankSalaryEnum> lstBonusSales = new ArrayList<RankSalaryEnum>();
        lstBonusSales.add(RankSalaryEnum.MANAGER);
        lstBonusSales.add(RankSalaryEnum.SALES);
        return lstBonusSales;
    }
}

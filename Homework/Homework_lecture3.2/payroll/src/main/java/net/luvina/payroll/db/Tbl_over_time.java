package net.luvina.payroll.db;

import net.luvina.payroll.Enum.RankSalaryEnum;

import java.util.ArrayList;
import java.util.List;

public class Tbl_over_time {
    // thay cho câu lệnh select trong db
    public static List<RankSalaryEnum> getLstOT() {
        List<RankSalaryEnum> lstOT = new ArrayList<RankSalaryEnum>();
        lstOT.add(RankSalaryEnum.ENGINEER);
        lstOT.add(RankSalaryEnum.WORKER);
        return lstOT;
    }
}

package net.luvina.payroll.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import net.luvina.payroll.constant.Constant;

/**
 * The Class Common.
 */
public class Common {

	/**
	 * Tính toán ngày tháng: từ ngày hiện tại trừ đi ngày được truyền vào
	 *
	 * @param ngày cần tính toán
	 * @return ngày tháng thập phân
	 */
	public static float calculatorDate(String date) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(Constant.FORMAT_DATE);
		LocalDate birthDay = LocalDate.parse(date, dateFormatter);
		return birthDay.until(LocalDate.now(), ChronoUnit.DAYS) / Constant.DECIMAL_NUMBER_OF_YEARS;
	}

	/**
	 * Tính toán năm và tháng kinh nghiệm được làm tròn xuống.
	 *
	 * @param số năm và tháng kinh nghiệm
	 * @return số năm và tháng kinh nghiệm
	 */
	public static float calculateYearsAndMonthOfExperience(String date) {
		float yearExp = Common.calculatorDate(date);
		return (float) ((Math.floor(yearExp * Constant.NUMBER_YEAR_MONTH) / Constant.NUMBER_YEAR_MONTH));
	}

	/**
	 * Tính toán năm kinh nghiệm
	 *
	 * @param số năm và tháng kinh nghiệm
	 * @return số năm kinh nghiệm
	 */
	public static int calculateYearsOfExperience(String date) {
		return (int) Common.calculatorDate(date);
	}

	/**
	 * Chuyển đổi thành text hiển thị số năm kinh nghiệm.
	 *
	 * @param số năm kinh nghiệm
	 * @return text số năm kinh nghiệm
	 */
	public static String convertToTextExp(float date) {
		int year = (int) (date);
		int month = (int) (date * Constant.NUMBER_YEAR_MONTH - year * Constant.NUMBER_YEAR_MONTH);
		StringBuilder sp = new StringBuilder();
		// nếu năm tháng là 0 thì sẽ k thêm
		if (year != Constant.NUMBER_IGNORE) {
			sp.append(year + Constant.YEAR_VN);
		}
		if (month != Constant.NUMBER_IGNORE) {
			sp.append(month + Constant.MONTH_VN);
		}
		sp.append(Constant.EXP_VN);

		return sp.toString();
	}
}

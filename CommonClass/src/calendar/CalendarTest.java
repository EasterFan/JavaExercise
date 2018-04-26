package calendar;

import java.util.Calendar;

/**
 * Calendar 获取单个年月日
 * 查表法获得年月
 */
public class CalendarTest {
    public static void main(String[] args) {
        // 可以自己 new ,也可以通过instance 获取
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        // 国外的月份比我们少一月
//        int month = c.get(Calendar.MONTH) + 1;
        String month = getUpperMonthNumber(c.get(Calendar.MONTH));
        int day = c.get(Calendar.DAY_OF_MONTH);
        String week = getUpperWeekNumber(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(year +"年"+ month +"月"+ day + "日" + "星期" + week);
    }

    /**
     * 查表法获得年月
     */
     static String getUpperMonthNumber(int index){
        String arr[] = {"一","二","三","四","五","六","七","八","九","十","十一","十二"};
        return arr[index];
    }

    static String getUpperWeekNumber(int index){
         // 数组从 0 开始计数, 第一位设为空
        String arr[] = {"","七","一","二","三","四","五","六"};
        return arr[index];
    }
}

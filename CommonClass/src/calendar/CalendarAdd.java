package calendar;

import java.util.Calendar;

/**
 * Calendar 时间元素增量 -- add
 * 获取任意年的二月有多少天
 *
 * c.set(year,2,1) // 某一年的3月1日
 * c.add(Calendar.DAY_OF_MONTH, -1) // 3月1日,往前推一天,就是2月最后一天
 *
 * 获取昨天的现在这个时刻
 */
public class CalendarAdd {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // 改变日期 -- 月份会有一个月的差距
        c.set(2020,01,23);

        c.add(Calendar.DAY_OF_MONTH,3);
        printCalendar(c);
    }

    // 打印日期的工具类
    static void printCalendar(Calendar c){
        String month[] = {"一","二","三","四","五","六","七","八","九","十","十一","十二"};
        String week[] = {"","七","一","二","三","四","五","六"};

        int index = c.get(Calendar.MONTH);
        int index2 = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(month[index] + "月" + "星期"+week[index2]);
    }
}

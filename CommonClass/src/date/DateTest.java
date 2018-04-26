package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 按照需求排出需要的时间格式
 * Date 类很多方法已过时, 参见相关类 DateFormat 的子类 -- SimpleDateFormat
 */
public class DateTest {
    public static void main(String[] args) {
        // date 的日期格式不方便,希望日期有些格式
        Date date = new Date();

        // 将模式封装到 SimpleDateFormat 对象中
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 星期E kk:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);
    }
}

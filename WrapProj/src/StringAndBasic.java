/**
 * 基本数据类型和字符串之间的转换
 */
public class StringAndBasic {
    public static void main(String args[]){

        int intNum = 3;
        String string = "4";

        // 基本数据类型转字符串---通过包装类的toString()
        Integer integer = new Integer(intNum);
        String stringFromInteger = integer.toString();

        // 字符串转基本数据类型---1.通过包装类的parseInt()，返回值为int
        int intFromString = Integer.parseInt(string);

        // 字符串转基本数据类型---2.通过包装类的valueOf()，返回值为Integer对象，Integer可自动拆箱
        int intFromString2 = Integer.valueOf(string);

        // 测试
        System.out.println("基本数据类型转字符串:"+stringFromInteger);
        System.out.println("字符串转基本数据类型:"+intFromString);
        System.out.println("字符串转基本数据类型:"+intFromString2);
    }
}

/**
 * 包装类和基本数据类型相互转化---代码实现装箱和拆箱
 */
public class BasicAndClass {
    public static void main(String args[]){

        int intNum = 3;
        Integer integerNum = 4;
        // 装箱：基本数据类型--->包装类
        // 1. 自动装箱
        Integer selfInBox_integer = intNum;

        // 2. 手动装箱
        Integer handInBox_integer = new Integer(intNum);

        // 测试
        System.out.println("基本数据类型int本来的值:"+intNum);
        System.out.println("自动装箱:"+selfInBox_integer);
        System.out.println("手动装箱:"+handInBox_integer);
        System.out.println("==================");



        // 拆箱：包装类--->基本数据类型
        // 1. 自动拆箱
        int selfOutBox_int = integerNum;

        // 2. 手动拆箱
        int handOutBox_int = integerNum.intValue();

        // int包装类Integer可以拆箱成double/float/short基本数据类型
        double handOutBox_double = integerNum.doubleValue();
        float handOutBox_float = integerNum.floatValue();
        short handOutBox_short = integerNum.shortValue();


        // 测试
        System.out.println("包装类Integer本来的值:"+integerNum);
        System.out.println("自动拆箱:"+selfOutBox_int);
        System.out.println("手动拆箱:"+handOutBox_int);
    }
}

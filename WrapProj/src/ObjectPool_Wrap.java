/**
 * Created by easter on 17-11-12.
 * 包装类对象间的比较
 */
public class ObjectPool_Wrap {
    public static void main(String args[]){

        // 1. 等号两边比较的是对象---new关键字创建两个不同的内存空间，内存地址不相等
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println("one == two的结果："+(one == two)); // 1
        System.out.println("one == two的结果11："+(one.equals(two))); // 1

        // 2. 等号两边比较的是int数值---由于自动装箱和拆箱
        Integer three = 100; // 自动装箱
        System.out.println("three == 100 的结果："+(three == 100)); // 2 自动拆箱

        // 3. 等号两边比较的是对象--- three和four指向对象池中同一块内存空间
        Integer four = 100;
//        Integer four = Integer.valueOf(100);
        System.out.println("three == four 的结果："+(three == four)); // 3

        // 4. 等号两边比较的是int数值---由于自动装箱和拆箱
        Integer five = 200;
        System.out.println("five == 200 的结果："+(five == 200)); // 4

        // 5. 等号两边比较的是对象--- 超出对象池范围，new新的对象
        Integer six = 200;
        System.out.println("six == five 的结果："+(five == six)); // 5

        // 6. 等号两边比较的是对象--- double和float没有对象常量池的概念
        Double seven = 100.0;
        Double eight = 100.0;
//        Double seven = Double.valueOf(100);
        System.out.println("seven == eight 的结果："+(seven == eight)); // 6

        String a = "blast";
        String b = "rain";
        b = b + "sky";

    }
}

package vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 枚举遍历取出 Vector 集合对象
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("spring");
        v.add("summer");
        v.add("fall");
        v.add("winter");

        // 枚举取出
        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}

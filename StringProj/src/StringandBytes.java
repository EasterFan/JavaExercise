import java.io.UnsupportedEncodingException;

/**
 * Created by easter on 17-11-13.
 * 字符串与字符数组的相互转换
 */
public class StringandBytes {
    public static void main(String args[]) throws UnsupportedEncodingException {

        String string = new String("JAVA 编程 基础");

        // 将字符串转为byte数组
        byte[] arrs = string.getBytes();
//        byte[] arrs = string.getBytes("GBK");
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]);
        }

        // 将byte数组转为字符串
        String string2 = new String(arrs);
        System.out.println(string2);

        String string3 = new String(arrs,"GBK");
        System.out.println(string3);

    }
}

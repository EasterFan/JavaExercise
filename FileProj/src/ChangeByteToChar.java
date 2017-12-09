import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字节字符转换流---将输入流中byte字节转为char字符，用InputStreamReader类实现
 */
public class ChangeByteToChar {
    public static void main(String[] args) {
        try {
            // 读字节输入流
            FileInputStream fis = new FileInputStream("changeBytetoChar.md");

            // 流转换
            InputStreamReader isr = new InputStreamReader(fis);

            // 读字符输入流--用字符存放读取的字符
            int n = 0;
//            while((n = isr.read()) != -1){
//                System.out.print((char)n);
//            }

            // 读字符输入流--用字符数组存放读取的字符
            char[] cbuf = new char[80];
            while ((n = isr.read(cbuf)) != -1){
//                将字符数组转为字符串输出
                String s = new String(cbuf,0,n);
                System.out.println(s);
            }

            isr.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

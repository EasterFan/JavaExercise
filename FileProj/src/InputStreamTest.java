import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入字节流-逐个读取文件字节内容
 */
public class InputStreamTest {
    public static void main(String[] args) {

        try {
            // 1.创建FileInputStream对象
            FileInputStream fis = new FileInputStream("/home/easter/Desktop/TestFile.md");
//            int n = fis.read();
//            while (n != -1){
//                System.out.print((char)n);
//                n = fis.read();
//            }

            // 2.简略写法，循环读取输入流
            int n = 0;
            while ((n = fis.read()) != -1){
                System.out.print((char)n);
            }

            // 3.关闭输入流，释放内存
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

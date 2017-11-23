import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读输入流，将结果存储到字节数组中
 */
public class InputStreamByteTest {
    public static void main(String[] args) {
        try {
            // 1.创建FileInputStream对象
            FileInputStream fis = new FileInputStream("/home/easter/Desktop/TestFile.md");

            // 2.读取输入流，并存入字节数组
            byte[] bytes = new byte[100];
//            fis.read(bytes);
            // 读前四个字节
            fis.read(bytes,0,4);
            System.out.println(new String(bytes));

            // 3.关闭输入流，释放内存
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

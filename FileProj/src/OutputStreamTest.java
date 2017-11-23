import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流在写文件时的编码问题
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;

        try {
            fos = new FileOutputStream("output.md");
            fis = new FileInputStream("output.md");
//            向原文件追加
//            fos = new FileOutputStream("output.md",true);
            fos.write(11);
            fos.write('f');

            System.out.println(fis.read());
            System.out.println((char) fis.read());

            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

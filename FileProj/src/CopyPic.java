import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 拷贝一张图片
 */
public class CopyPic {
    public static void main(String[] args) {

        FileInputStream fis ;
        FileOutputStream fos;

        try {
            fis = new FileInputStream("test11.jpg");
            fos = new FileOutputStream("test22.jpg");

            int n = 0;
            byte[] bytes = new byte[1024];
            while ((n = fis.read(bytes)) != -1){
                fos.write(bytes);
            }

            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}

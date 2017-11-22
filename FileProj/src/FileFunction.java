import java.io.File;
import java.io.IOException;

/**
 * 创建File类对象
 */
public class FileFunction {
    public static void main(String[] args) {

        // 创建File对象--两种方式
        File file = new File("/home/easter/Desktop/fileTest/fdfTest.md");
//        File file = new File("/home/easter/Desktop","/fileTest/fdfTest.md");

        // 判断是文件还是目录---前提是文件存在
        System.out.println("是否是目录"+file.isDirectory());
        System.out.println("是否是文件"+file.isFile());

        // 创建目录---创建之前先判断是否存在
        File file1 = new File("/home/easter/Desktop/fileTest","ddd");
        if(!file1.exists()){
            file1.mkdir();
        }

        // 创建文件
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

import java.io.*;

/**
 * 缓冲输入流---将文件写入后，用缓冲输出流读
 */

public class BufferedOutputStream {
    public static void main(String[] args) {

        try {

            // 将输出流和缓存输出流关联
            FileOutputStream fos = new FileOutputStream("output.md");
            java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(fos);

            // 将输入流和缓存输入流关联
            FileInputStream fis = new FileInputStream("output.md");
            BufferedInputStream bis = new BufferedInputStream(fis);


            // 写入
            bos.write(11);
            bos.write('s');

            // 此时打开output.md文件，没有看到写入的内容====内容被写到了缓存区，而缓存区未满，没有自动触发write方法写到文件中

            // 调用flush方法，手动刷新写入

            bos.flush();


            System.out.println(bis.read());
            System.out.println(bis.read());



            // 不用flush，关闭流的时候也会强制刷新，写入文件
            bos.close();
            fos.close();
            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}

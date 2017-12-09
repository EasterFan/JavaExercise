import java.io.*;

/**
 * 字节字符转换流---将输出流中byte字节转为char字符，用OutputWriter类实现复制粘贴一个文本
 * 先用FileInputStream读输入流，再用FileOutStream写输出流
 */

public class ChangeBytetoCharOutput {
    public static void main(String[] args) {

        try {
            // 字节输入输出流====模拟从网络中传来的文件
            FileInputStream fis = new FileInputStream("changeBytetoChar.md");
            FileOutputStream fos = new FileOutputStream("changeBytetoCharOutput.md");

            // 流转换
            InputStreamReader isr = new InputStreamReader(fis,"GBK");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");

            // 加入缓存
            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(osw);

            // 暂时存储字符
            int n = 0;
            char[] cbuf = new char[80];

            while ((n = br.read(cbuf)) != -1){
                bw.write(cbuf);
                bw.flush();
            }


            br.close();
            bw.close();
            isr.close();
            osw.close();
            fis.close();
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

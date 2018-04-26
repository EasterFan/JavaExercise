package runtimeproj;

import java.io.IOException;

/**
 * 每个 java 应用程序都有一个 Runtime 类, 使应用程序能够与其运行的环境连接(java 跨平台)
 * Runtime 的 exec 方法能够启动.exe 文件, 并在文件管理器中新建一个进程
 */
public class RuntimeTest {
    public static void main(String[] args) {
        // 获取 Runtime 对象
        Runtime rt = Runtime.getRuntime();

        // 执行文件 - 文件路径错误异常
        try {
            Process p = rt.exec("c://Program files//win.exe");

            Thread.sleep(4000);

            // 杀死进程 -- 进程,而非线程 -- 只能杀死自己创建的进程,不能杀死其它进程
            p.destroy();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

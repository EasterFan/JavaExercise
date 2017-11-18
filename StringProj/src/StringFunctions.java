/**
 * Created by easter on 17-11-12.
 */
public class StringFunctions {
    public static void main(String args[]){
        String str1 = "JAVA 编程 基础";
        String str2 = "JAVA编程基础，我喜欢java编程";


        // 输出字符串的长度
        System.out.println(str1.length());

        // 取出 程
        System.out.println(str1.charAt(6));

        // 取出 编程 基础
        System.out.println(str1.substring(5));
        // 取出子串 编程
        System.out.println(str1.substring(5,7));

/****************************************************************/

        // 查找字符A在字符串中第一次出现的位置
        System.out.println("字符A在字符串中第一次出现的位置"+str2.indexOf("A"));

        // 查找字符串”编程“在字符串中第一次出现的位置
        System.out.println("字符“编程”在字符串中第一次出现的位置"+str2.indexOf("编程"));

        // 查找字符A在字符串中最后一次出现的位置
        System.out.println("字符A在字符串中第一次出现的位置"+str2.lastIndexOf("A"));

        // 查找字符串”编程“在字符串中最后一次出现的位置
        System.out.println("字符“编程”在字符串中第一次出现的位置"+str2.lastIndexOf("编程"));

    }
}

/**
 * 字符串 <---> 字符数组
 */
public class StringandChars {

    // 字符数组 ---> 字符串  (初始化方式)
    static String charToString1(char[] arr){
        String str = new String(arr);
        return str;
    }

    // 字符数组 ---> 字符串  (静态方法 -- copyValueOf)
    static String charToString2(char[] arr){
        String str = String.copyValueOf(arr);
        return str;
    }

    // 字符串 ---> 字符数组 (toCharArray())
    static char[] StringtoChar(String str){
        return str.toCharArray();
    }


    public static void main(String[] args) {
        // 字符数组 ---> 字符串
        char[] arr = {'s','f','d','h'};
        System.out.println(charToString1(arr));
        System.out.println(charToString2(arr));

        // 字符串 ---> 字符数组
        String str = "sjfhjdf";
        char[] result = StringtoChar(str);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

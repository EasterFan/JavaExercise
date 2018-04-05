package exercise;

/**
 * 获取两个字符串中最大相同子串
 */
public class GetMaxSameString {

    public static String getMaxSameString(String str1, String str2){
        String max = (str1.length()>str2.length())?str1:str2;
        String min = (max == str1)?str2:str1;

        for(int i=0;i<min.length();i++){
            for(int start = 0,end = min.length() - i;end!=min.length()+1;start++,end++){
                String temp = min.substring(start,end);
                System.out.println(temp);
                if(max.contains(temp)) return temp;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s1 = "abcheasoexsdf";
        String s2 = "45easter123";
        System.out.println("result: "+getMaxSameString(s1,s2));
    }
}

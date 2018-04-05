package exercise;

/**
 * 获取一个子串在另一个子串中出现的次数  --- parentStr.split(childStr);数组中有多少元素, 就出现了(几-1)次
 */
public class CountNum {
    public static int countStringAInBNumber(String parentStr,String childStr){
        int count;
        String[] arr = parentStr.split(childStr);

        // 额外考虑子串与父串相同 / 子串位于末尾的情况
        if(parentStr.equals(childStr))
            count = 1;
        else if(parentStr.endsWith(childStr))
            count = arr.length;
        else
            count = arr.length - 1;

        return count;
    }


    public static void main(String[] args) {
        String pareStr = "abcdedgedkjedkied";
        String childStr = "d";
        int result = countStringAInBNumber(pareStr,childStr);
        System.out.println(result);
    }
}

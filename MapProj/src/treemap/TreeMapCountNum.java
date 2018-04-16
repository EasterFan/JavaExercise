package treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * 数字符串中字母出现的次数
 * 输入: "abcdsacxdcxsdxaabc"
 * 输出: "a(4)b(2)c(4)d(3)s(2)x(3)"
 *
 * 1. 字符串转为字符数组 -- 因为要对单个字母操作
 * 2. 将字母为键,次数为值存入 treemap中,第一次返回为null ,存入 字母:1, 以后不返回 null, 则使次数自增
 * 3. 将 TreeMap 转换成字符串
 */

public class TreeMapCountNum {
    public static void main(String[] args) {

        String string = "abcdsacxdcxsdxaabc";

        printMap(getCountedMap(changeStringToChar(string)));
    }

    // 1. 字符串转字符数组
    static char[] changeStringToChar(String str){
        return str.toCharArray();
    }

    // 2. 数出字母的个数, 存入 treemap
    static TreeMap<Character,Integer> getCountedMap(char arr[]){
        TreeMap<Character,Integer> tm = new TreeMap<>();

        for(int i = 0;i<arr.length;i++){
            Integer value = tm.get(arr[i]);

            if(tm.containsKey(arr[i])){
                value = value +1 ;
                tm.put(arr[i],value);
            }else {
                tm.put(arr[i],1);
            }
        }
        return tm;
    }

    // 3. Treemap 转换成字符串
    static void printMap(TreeMap<Character,Integer> treeMap){
        Set<Character> ts = treeMap.keySet();
        for(Iterator<Character> it = ts.iterator();it.hasNext();){
            Character key = it.next();
            Integer value = treeMap.get(key);
            System.out.print(key + "(" + value +")");
        }
    }
}


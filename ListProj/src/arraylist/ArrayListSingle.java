package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList 去重
 */
public class ArrayListSingle {
    public static ArrayList quChong(ArrayList arrayList){
        ArrayList arr = new ArrayList();
        for(Iterator it = arrayList.iterator();it.hasNext();){
            Object obj = it.next();
            if(!arr.contains(obj)){
                arr.add(obj);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("11");
        arrayList.add("11");
        arrayList.add("22");
        arrayList.add("22");
        arrayList.add("33");
        arrayList.add("33");

        System.out.println(quChong(arrayList).toString());
    }
}

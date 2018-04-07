package linkedlist;

import java.util.LinkedList;

/**
 * LinkedList 模拟堆栈或队列
 * 堆栈: 先进后出
 * 队列: 先进先出
 *
 * 关于封装 -- 封装进项目中更容易识别的名字
 */

class DuiLie{
    private LinkedList link;

    DuiLie(){
        link = new LinkedList();
    }

    public void myAdd(Object obj){
        link.addFirst(obj);
    }

    //
    public Object myGet(){
        return link.removeFirst();
    }

    public Object myGet2(){
        return link.removeLast();
    }

    public boolean isNull(){
        return link.isEmpty();
    }
}


public class LinkedListTest {
    public static void main(String[] args) {
        DuiLie dl = new DuiLie();

        dl.myAdd("spring");
        dl.myAdd("summer");
        dl.myAdd("fall");
        dl.myAdd("winter");

        // 堆栈
//        while (!dl.isNull()){
//            System.out.println(dl.myGet());
//        }

        // 队列
        while (!dl.isNull()){
            System.out.println(dl.myGet2());
        }
    }
}

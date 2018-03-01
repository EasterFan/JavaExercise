package com.easter.Abstract;

/**
 * 获取一段程序运行的时间
 * 模板方法设计模式
 */
public abstract class Template {

    // 确定的部分,不希望被重写 - final
    public final void getTime(){
        long start = System.currentTimeMillis();

        runcode();

        long end = System.currentTimeMillis();
        System.out.println("毫秒:"+(end-start));
    }

    // 可以定义成抽象方法,也可以是普通方法,只要能被重写即可
    public abstract void runcode();
}

class SubTime extends Template{
    @Override
    public void runcode() {
        for (int i=0;i<800;i++){
            System.out.println(i);
        }
    }

    // 测试
    public static void main(String[] args) {
        SubTime st = new SubTime();
        st.getTime();
    }
}
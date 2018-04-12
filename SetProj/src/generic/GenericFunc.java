package generic;

/**
 * 泛型方法
 */


class Demo{
    // 泛型方法
    public <F> void show(F f){
        System.out.println("show:"+ f);
    }

    public <Q> void print(Q q){
        System.out.println("print: " + q);
    }

    // 不用泛型, 用重载的方法 -- 繁琐
    /*
    public void show(String s){

    }

    public void print(Integer i){

    }
    */

    // 静态方法泛型
    public static <P> void method(P p){
        System.out.println(p);
    }
}

/**
 * 泛型方法的使用
 */
public class GenericFunc {
    public static void main(String[] args) {

        // 传入 String
        /*
        Demo<String> d = new Demo<String>();

        d.show("aaa");
        d.print("bbb");

        */

        // 传入 Integer
        /*
        Demo demo = new Demo();

        demo.show(new Integer(4));
        demo.print(5);
        */

        // 同时传入 String 和 Integer
        Demo dd = new Demo();
        dd.show("dddd");
        dd.show(6);

        Demo.method("静态方法: kkk");
    }
}

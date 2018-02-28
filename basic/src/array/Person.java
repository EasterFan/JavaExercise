package array;

/**
 * 测试对象创建执行过程
 */

public class Person {
    private String name = "Tom";
    private int age;
    private static String country = "china";
    private static String hair;

    static {
        System.out.println("static代码块(演示静态成员变量优先于静态代码块):"+country);
    }

    {
        System.out.println("构造代码块:(演示构造方法块优先于构造方法代码块)"+"name"+name+",age"+age+",country"+country + ",hair"+hair);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person jack = new Person("jack",20);
        System.out.println("name"+jack.name+",age"+jack.age+",country"+jack.country);
    }

}





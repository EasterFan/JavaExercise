package generic;

/**
 * 泛型类
 */
public class GenericClass {
    public static void main(String[] args) {

        // 以前的出现类型转换异常的写法 - 编译时不报错, 运行时报错
        /*
        Tool tool = new Tool();
        tool.setObj(new Student());
        Worker wo = (Worker) tool.getObject();
        */

        // 现在的泛型写法  -- 编译时报错
        GenericTool<Worker> workerGenericTool = new GenericTool<Worker>();

        // 如果插入错误类,编译时报错
//        workerGenericTool.setAnimal(new Student());
        workerGenericTool.setAnimal(new Worker());
    }
}

/**
 * 以前的实现方法
 */

/*
class Tool{
    private Object obj;

    public void setObj(Object obj){
        this.obj = obj;
    }
    public Object getObject(){
        return obj;
    }
}

*/

/**
 * 现在的泛型写法  -- 泛型类
 */
class GenericTool<Animal>{
    private Animal animal;

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public Animal getAnimal(){
        return animal;
    }
}

class Student{

}

class Worker{

}
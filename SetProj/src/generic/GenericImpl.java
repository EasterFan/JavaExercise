package generic;

/**
 * 泛型接口 --- 两种实现方式
 */

interface  inter<T>{
    public void show(T t);
}

/**
 * 实现一: 在实现接口时,就指定泛型类型
 */
class Interimpl implements inter<String>{

    @Override
    public void show(String string) {
        System.out.println("实现一: 在实现接口时,就指定泛型类型" + string);
    }
}

/**
 * 实现二: 在实现接口时, 仍然不指定泛型类型
 * @param <T>
 */
class InteImplment<T> implements inter<T>{

    @Override
    public void show(T t) {
        System.out.println("实现二: 在实现接口时, 仍然不指定泛型类型" + t);
    }
}

public class GenericImpl {
    public static void main(String[] args) {
        Interimpl in = new Interimpl();
        in.show("ddd");

        InteImplment<Integer> inm = new InteImplment<Integer>();
        inm.show(7);
    }
}

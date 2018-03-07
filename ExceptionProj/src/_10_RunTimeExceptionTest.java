/**
 * RuntimeException 直接让程序挂掉的使用
 */


/**
 * 接口
 */
interface Shape{
    void getArea();
}

/**
 * 异常类 --- 输入长宽为负数
 */
class WrongValueException extends RuntimeException{
    WrongValueException(String msg){
        super(msg);
    }
}

/**
 * 长方形
 */
class Rec implements Shape{
    private int len,wid;

    public Rec(int len,int wid){
        this.len = len;
        this.wid = wid;
    }

    @Override
    public void getArea() {
        // RuntimeException 及子类异常可以不 throws 抛出, 一旦异常发生,直接让程序挂掉
        if(len<=0 || wid <=0) throw new WrongValueException("错误的长宽");
        System.out.println(len * wid);
    }
}

/**
 * 圆形
 */
class Circle implements Shape{
    private int radius;
    public static final double PI = 3.14;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        if(radius<=0) throw new WrongValueException("错误的半径");
        System.out.println(radius*radius*PI);
    }
}

/**
 * 测试用例
 */
public class _10_RunTimeExceptionTest {
    public static void main(String[] args) {
        Rec rec = new Rec(3,4);
        rec.getArea();

        Circle circle = new Circle(4);
        circle.getArea();
    }
}

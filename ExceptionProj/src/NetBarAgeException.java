/**
 * 自定义异常类--频繁出现的特定业务
 */
public class NetBarAgeException extends Exception {

    // 构造方法
    public NetBarAgeException(){
        super("未成年人禁止入内");
    }
}

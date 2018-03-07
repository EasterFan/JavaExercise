/**
 * 自定义异常类 -- 被除数为非负数
 */

class FuShuException extends Exception{
    private int value;

   // 默认构造函数
    FuShuException(){
        super();
    }

    // 接入子类异常信息
    FuShuException(String msg,int value){
        super(msg);
        this.value = value;
    }

    // 获取输入的负数
    public int getValue() {
        return value;
    }
}

/**
 * 抛出异常
 */

class ChuFa{
    // 当函数内部已经用 throw 抛出异常对象, 函数名的处理
    int div(int a,int b) throws FuShuException{
        if(b<0) throw new FuShuException("被除数不可以为负数",b);
        return a/b;
    }
}

/**
 * 处理异常
 * 主函数 -- 不能再 throws 了,必须 try catch 解决
 */
public class _05_CustomThrowFushu {
    public static void main(String[] args) {
       ChuFa cf = new ChuFa();

       try {
            cf.div(2,-2);
        } catch (FuShuException e) {
            e.printStackTrace();
           System.out.println(e.getMessage());
           System.out.println("错误的负数是: "+e.getValue());
        }
    }
}
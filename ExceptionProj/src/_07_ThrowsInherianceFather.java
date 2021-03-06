/**
 * Throws继承中的父类
 */
public class _07_ThrowsInherianceFather {

    public void fatherTest() throws NetBarAgeException {
        throw new NetBarAgeException();
    }

    public class SonNetBarAgeException extends NetBarAgeException {

    }
}

/**
 * Throws继承中的子类
 */
class _07_ThrowsInherianceSon extends _07_ThrowsInherianceFather {

    // 可以发现，子类重写父类方法，默认抛出父类异常NetBarAgeException
    // 将NetBarAgeException改为Exception（报错）/RuntimeException（正常）/SonNetBarAgeException（正常）
    // 因为Exception和NetBarAgeException是父子关系，RuntimeException和NetBarAgeException是兄弟关系，
    // SonNetBarAgeException和NetBarAgeException是子父关系

    @Override
    public void fatherTest() throws SonNetBarAgeException {
//        super.fatherTest();
    }
}


/**
 * 测试类
 */
class _07Test{
    public static void main(String[] args) {

    }
}
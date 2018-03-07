/**
 * 异常在父类覆盖中的体现
 */

class AException extends Exception{

}

class BException extends AException{

}


class CException extends Exception{

}

/**
 * 因为 父类抛出的是 AException
 */
class Father{
    void fun() throws AException{
        throw new AException();
    }
}

/**
 * 所以 子类 throws 的异常只能是 AExcepption 或 BException
 */
class Child extends Father{
    void fun() throws BException{
        throw new BException();
    }
}

public class _09_ExtendsInExceptionTest {
}

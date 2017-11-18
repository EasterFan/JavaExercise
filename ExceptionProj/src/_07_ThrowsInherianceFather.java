/**
 * Throws继承中的父类
 */
public class _07_ThrowsInherianceFather {

    public void fatherTest() throws _05_NetBarAgeException {
        throw new _05_NetBarAgeException();
    }

    public class SonNetBarAgeException extends _05_NetBarAgeException {

    }
}

/**
 * 模拟多个用户同时进行存取款操作，存款线程操作Bank类时，不允许其他线程操作Bank类
 */


public class _BankTest {
    public static void main(String[] args) {
        // 创建账户
        _Bank bank = new _Bank("fff",100);

        // 创建存取款线程
        _MoneyIn in = new _MoneyIn(bank);
        _MoneyOut out = new _MoneyOut(bank);

        Thread in1 = new Thread(in);
        Thread out1 = new Thread(out);

        in1.start();
        out1.start();

        // 需要先执行存取款操作，最后打印余额，故需抢占
        try {
            out1.join();
            in1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bank);
    }
}

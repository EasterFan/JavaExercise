/**
 * 存款---把存款方法放入一个线程中
 */
public class _MoneyIn implements Runnable{
     _Bank bank;

    public _MoneyIn(_Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.moneyIn();

    }
}

/**
 * Created by easter on 17-11-19.
 */
public class _MoneyOut implements Runnable {
     _Bank bank;

    public _MoneyOut(_Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.moneyOut();
    }
}

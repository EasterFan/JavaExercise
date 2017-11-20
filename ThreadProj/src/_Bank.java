/**
 * 银行类
 */
public class _Bank {

    private String account;// 账号
    private int balance;  // 余额

    public _Bank(String account,int balance){
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "[账户："+ account + ",余额" + balance+"]";
    }

    // 存款 -- 每次存￥10
    public synchronized void  moneyIn(){
        // 先获取当前余额
        int balance1 = getBalance();
        System.out.println("存款前的余额"+balance1);

        // 模拟存款进程被打断
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // 存入￥10
        balance1 += 10;

        // 修改账户余额
        setBalance(balance1);

        // 输出存款后的余额
        System.out.println("存款后的余额为"+getBalance());
    }


    // 取款---每次取￥5

    public void moneyOut() {

        synchronized (this) {
            // 获取余额
            int balance2 = getBalance();
            System.out.println("取款前的余额" + balance2);
            // 取出余额
            balance2 -= 5;

            // 模拟取款进程被打断
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

            // 修改余额
            setBalance(balance2);
            //输出取款后的余额
            System.out.println("取款后的余额为" + getBalance());
        }
    }

}

package multi;

public class Account  implements Runnable{

    public void run()
    {
        synchronized (this){
        withdraw(100);
    }}
    private long balance;

    public Account()
    {}

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void withdraw(long amount)
    {
        if(balance>amount) {
            System.out.println("transaction beggining");
            System.out.println("balance :"+balance);
            balance -= amount;
            System.out.println("transactn done :"+balance);
            System.out.println("Transaction successful");
        }else
            System.out.println("Not enough balance");
    }


}

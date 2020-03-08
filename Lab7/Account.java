public class Account{
    public double balance;

    public Account(){
        this.balance = 0;

    }

    public double deposit (double money){
        balance += money;
        System.out.println(Double.toString(balance));

        return balance;

    }

    public  double withdraw (double money){
        if (balance - money >= 0){
            balance  -= money;
            System.out.println(Double.toString(balance ));
            return balance;
        }
        else{
            throw new NotEnoughMoneyException(money, balance);
        }


    }

    public double getBalance(){
        return balance;
    }

}

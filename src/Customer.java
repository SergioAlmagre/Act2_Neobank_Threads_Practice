public class Customer extends Thread {

    String name;
    Account account;
    Double amountWithdrawn;
    Double amountDeposit;

    public Customer(String name, Account account,Double amountDeposit, Double amountWithdraw) {

        this.name = name;
        this.account = account;
        this.amountDeposit = amountDeposit;
        this.amountWithdrawn = amountWithdraw;
    }

    @Override
    public void run(){

        while(account.getTotalWithdrawn()< account.maxAmountWithdraw){
            if(amountDeposit > 0){
                try {
                    account.deposit(amountDeposit);
                    synchronized (account){
                        account.notify();
                    }
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e.getMessage() + "Error in deposit");
                }
            }else {
                try {
                    account.withdraw(amountWithdrawn);
                    synchronized (account){
                        account.notify();
                    }
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e.getMessage() + "Error in withdraw");
                }
            }
        }
    }

}

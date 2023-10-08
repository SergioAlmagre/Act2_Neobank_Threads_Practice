import java.time.LocalDateTime;

public class Account {

    Double moneyAccount;
    Double maxAmoutAllowedInAccount;
    Double maxAmountWithdraw;
    Double totalWithdrawn = 0.0;

    public Account(Double moneyAccount,Double maxAmountAllowed, Double maxAmountWithdraw) {
        this.moneyAccount = moneyAccount;
        this.maxAmoutAllowedInAccount = maxAmountAllowed;
        this.maxAmountWithdraw = maxAmountWithdraw;
    }

    public synchronized void deposit(Double amount){
        if((amount + moneyAccount) > maxAmoutAllowedInAccount){
            System.out.println("Sorry, you can't do this deposit because you will overcome the limit of " + maxAmoutAllowedInAccount);
            System.out.println("Try with other amount less than "+ (moneyAccount - maxAmoutAllowedInAccount)+"\n");
        }else{
            System.out.println(LocalDateTime.now());
            moneyAccount += amount;
            System.out.println("An deposit of: " + moneyAccount);
            System.out.println("Now, the account contains: " + moneyAccount+"\n");
        }
    }

    public synchronized void withdraw(Double amount) {
        if(amount < moneyAccount){
            System.out.println(LocalDateTime.now());
            moneyAccount -= amount;
            totalWithdrawn += amount;
            System.out.println("An withdrawal of: " + amount);
            System.out.println("Now, the account contains: " + moneyAccount+"\n");
            System.out.println("___Total whitdrawn: " + totalWithdrawn+"\n");
        }else{
            System.out.println("Sorry, the account don't have enough money to withdraw this amount");
            System.out.println("Try with other amount less than "+ moneyAccount+"\n");
        }
    }

    public synchronized Double getTotalWithdrawn(){
        return this.totalWithdrawn;
    }

    public synchronized Double getMaxAmountWithdraw(){
        return this.maxAmountWithdraw;
    }

}















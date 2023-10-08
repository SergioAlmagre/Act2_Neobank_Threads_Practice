import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Account neoBank = new Account(0.0,5000.0,6000.0);
        Customer customer1 = new Customer("Alfredo",neoBank,500.0,0.0);
        Customer customer2 = new Customer("Laura",neoBank,0.0,300.0);

        customer1.start();
        customer2.start();








//        while(customer2.amountWithdrawn > neoBank.maxAmountWithdraw){
//
//            if((customer1.amountMoney + neoBank.moneyAccount) > neoBank.maxAmoutAllowedInAccount){
//                System.out.println("Sorry, you can't do this deposit because you will overcome the limit of " + neoBank.maxAmoutAllowedInAccount);
//                System.out.println("Try with other amount less than "+ (neoBank.moneyAccount - neoBank.maxAmoutAllowedInAccount)+"\n");
//
//            }else {
//                System.out.println(LocalDateTime.now());
//                neoBank.moneyAccount += customer1.amountMoney;
//                System.out.println("An deposit of: " + neoBank.moneyAccount);
//                System.out.println("Now, the account contains: " + neoBank.moneyAccount+"\n");
//            }
//
//
//            if(customer2.amountMoney < neoBank.moneyAccount){
//                System.out.println(LocalDateTime.now());
//                neoBank.moneyAccount -= customer2.amountMoney;
//                System.out.println("An withdrawal of: " + customer2.amountMoney);
//                System.out.println("Now, the account contains: " + neoBank.moneyAccount+"\n");
//            }else{
//                System.out.println("Sorry, the account don't have enough money to withdraw this amount");
//                System.out.println("Try with other amount less than "+ neoBank.moneyAccount+"\n");
//            }
//
//        }
    }
}
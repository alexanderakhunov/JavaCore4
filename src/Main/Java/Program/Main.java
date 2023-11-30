package Java.Program;

import Java.OtherClass.*;

public class Main {
    public static void main(String[] args) throws IllegalBalanceException, InsufficientFoundsException {
        try {


            DebitAccount da = DebitAccount.createDebitAccount(20000, "Alex");
            CreditAccount ca = CreditAccount.createCreditAccount("gold", 100000, "Bobby");
            System.out.println(da);
            System.out.println(ca);
            Transaction.makeTransaction(da, ca);
            System.out.println(da);
            System.out.println(ca);
        }
        catch (IllegalBalanceException e){
            System.out.println(e.getMessage() + ": текущий баланс - " + e.getParam1());
        }
        catch (InsufficientFoundsException e){
            System.out.println(e.getMessage()+ ": текущий баланс - " + e.getParam1());
        }
        catch (Exception e){}
    }
}

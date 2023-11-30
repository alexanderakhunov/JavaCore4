package Java.OtherClass;

import java.util.Scanner;

public class Account {
    protected static Scanner sc = new Scanner(System.in);
    protected int Balance;
    protected int deposit;
    protected int sumAmountFromAccount;
    protected String nameHolder;


    public Account(int Balance, String nameHolder) {
        this.Balance=Balance;
        this.nameHolder = nameHolder;
    }

    public  int sumAmountFromAccount() throws IllegalBalanceException {
        System.out.println("Какую сумму снять?");
        sumAmountFromAccount = sc.nextInt();
        if(sumAmountFromAccount>this.Balance){
            throw new IllegalArgumentException("У вас нет столько денег");
//            throw new IllegalBalanceException("У вас нет столько денег, увы", this.Balance);
        }
        return this.Balance = Balance - sumAmountFromAccount;
    }
    public  int makeDeposit() throws IllegalBalanceException {
        System.out.println("Какую сумму внести?");
        deposit = sc.nextInt();
        if(deposit<=0){
            throw new IllegalArgumentException("Введите другую сумму");
        }
        return this.Balance = Balance + deposit;
    }

    @Override
    public String toString() {
        return String.format("CurrentBalance: "+ getBalance() + "\n" + "NameHolder: " + getNameHolder());
    }
    //region SetGet
    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }
//endregion

}

package Java.OtherClass;

public class DebitAccount extends Account {
    public DebitAccount(int Balance, String nameHolder) {
        super(Balance, nameHolder);
    }

    public static DebitAccount createDebitAccount(int startBalance, String nameHolder) throws IllegalBalanceException {
        if (startBalance < 0) {
            throw new IllegalBalanceException("Нельзя создать  отрицательный баланс", startBalance);
        }
        return new DebitAccount(startBalance, nameHolder);
    }

}

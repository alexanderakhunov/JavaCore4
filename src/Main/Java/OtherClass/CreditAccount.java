package Java.OtherClass;

public class CreditAccount extends Account {
    private String typeCreditCard;

    public CreditAccount(String typeCreditCard, int Balance, String nameHolder) {
        super(Balance, nameHolder);
        this.typeCreditCard = typeCreditCard;
    }

    public static CreditAccount createCreditAccount(String typeCreditCard, int startBalance, String nameHolder) throws IllegalBalanceException {
        if (startBalance < 0) {
            throw new IllegalBalanceException("Нельзя создать  отрицательный баланс", startBalance);
        }
        return new CreditAccount(typeCreditCard, startBalance, nameHolder);
    }
}

package Java.OtherClass;

import java.util.Scanner;

public class Transaction {
    private static final Scanner sc = new Scanner(System.in);

    /**
     *
     * @param a1 Счет списания средств
     * @param a2 Счет зачисления средств
     * @throws InsufficientFoundsException возникает в случае, если сумма перевода превышает баланс счета.
     * inFuture функционал с реализацией типов кредитных карт с привязкой к балансу карт,
     * а так же начисление процентов на кредитные карты.
     */

    public static void makeTransaction(Account a1, Account a2) throws InsufficientFoundsException {
        System.out.println("Введите сумму перевода не превышающую ваш текущий баланс: " + a1.getBalance());
        int transaction = sc.nextInt();
        if (transaction > a1.getBalance()) {
            throw new InsufficientFoundsException("Не хватает средств для совершения транзакции", a1.getBalance());
        }
        a1.setBalance(a1.getBalance() - transaction);
        a2.setBalance(a2.getBalance() + transaction);
    }
}

/*
1. Создать программу управления банковским счетом (Account).

Программа должна позволять пользователю вводить начальный баланс счета, сумму депозита и сумму снятия средств. При этом она должна обрабатывать следующие исключительные ситуации:

Попытка создать счет с отрицательным начальным балансом должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
Попытка внести депозит с отрицательной суммой должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
Попытка снять средства, сумма которых превышает текущий баланс, должна вызывать исключение InsufficientFundsException с сообщением о недостаточных средствах и текущим балансом.

Продемонстрируйте работу вашего приложения:
Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.

2*.
Создать несколько типов счетов, унаследованных от Account, например: CreditAcciunt, DebitAccount.
Создать класс (Transaction), позволяющий проводить транзакции между счетами (переводить сумму с одного счета на другой)

Класс Transaction должен возбуждать исключение в случае неудачной попытки перевести деньги с одного счета на другой.

Продемонстрируйте работу вашего приложения:
Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.


 */
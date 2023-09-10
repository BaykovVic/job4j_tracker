package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс, описывающий банковский сервис
 */
public class BankService {
    /**
     * Поле содержащее всех пользователей системы спривязанными к ним счетам
     * */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод, добавляющий пользователя в систему
     * Этот метод принимает, объект класса User, проверяет существует ли пользователь в систмеме
     * и в случае отсутствия пользователя в системе добавляет его в {@code users}
     * @param user - объект класса User
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод, удаляющий пользователя из системы
     * Этот метод принимает, {@code passport}, проверяет существует ли пользователь
     * с данными паспортными данными в систмеме
     * и в случае наличия пользователя в системе удаляет его из {@code users}
     * @param passport - паспортные данные
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод, добавляющий пользователю с заданными паспортными данными {@code passport}
     * банковский счет {@code account}
     * метод проверяет существует ли пользователь
     * с данными паспортными данными в систмеме, а также существует ли счет.
     * В случае наличия пользователя в системе и отсутствия счета добавляет счет пользователю
     * @param passport - паспортные данные
     * @param account  - счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод, осуществляющий поиск пользователя по заданным паспортным данным {@code passport}
     * @param passport - паспортные данные
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод, осуществляющий поиск счета (Account) по заданным паспортным данным {@code passport}
     * и по заданным реквизитам {@code requisite}
     * @param passport - паспортные данные
     * @param requisite - реквизиты счета
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        for (Account account : accounts) {
            if (requisite.equals(account.getRequisite())) {
                return account;
            }
        }
        return null;
    }

    /**
     * Метод, осуществляющий перевод суммы {@code amount} денег от пользователя с паспортными данными {@code srcPassport}
     * со счета {@code srcRequisite} на счет пользователя с паспортными данными {@code destPassport}
     * и реквизитами счета {@code destRequisite}
     * @param srcPassport - паспортные данные источника перевода
     * @param srcRequisite - реквизиты счета источника переваода
     * @param destPassport - паспортные данные пользователя, которому осуществляется перевод
     * @param destRequisite - реквизиты счета назначения
     * @param amount - количество переводимых денег
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null
                || srcAccount.getBalance() < amount) {
            return false;
        }
        destAccount.setBalance(destAccount.getBalance() + amount);
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        return true;
    }

    /**
     * Метод возвращает список счетов пользователя {@code user}
     * @param user
     * @return список счетов пользователя {@code user}
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
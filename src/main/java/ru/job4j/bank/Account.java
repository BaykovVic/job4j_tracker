package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author Victor Baykov
 * @version 1.0
 * */
public class Account {
    /**
     * Поле для хранения реквизитов счета
     */
    private String requisite;
    /**
     * Поле для хранения текущего баланса
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод-сеттер для поля requisite
     * @param requisite реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод-геттер, возвращающий текущий баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод-сеттер для поля balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Данный метод проверяет являются ли два объекта равными.
     * Возвращает true если ссылки указывают на один и тот же объект
     * Возвращает false если o указывает на null, либо если классы разные
     * @param o
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
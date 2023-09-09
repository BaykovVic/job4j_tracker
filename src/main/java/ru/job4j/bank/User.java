package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка
 */
public class User {
    /**
     * Поле для хранения номера паспорта пользователя банка
     */
    private String passport;
    /**
     * Поле для хранения ФИО пользователя банка
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод-геттер, возвращающий паспортные данные пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод-сеттер для поля passport
     * @param passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод-геттер, возвращающий ФИО пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод-сеттер для поля username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Хеш-функция, возвращающая числовое значение фиксированной длины
     * Служит так же для сравнения двух объектов
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
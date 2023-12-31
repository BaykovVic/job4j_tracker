package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> namePred = (person) -> person.getName().contains(key);
        Predicate<Person> surnamePred = (person) -> person.getSurname().contains(key);
        Predicate<Person> phonePred = (person) -> person.getPhone().contains(key);
        Predicate<Person> addressPred = (person) -> person.getAddress().contains(key);
        Predicate<Person> totalPred = namePred.or(surnamePred).or(phonePred).or(addressPred);
        for (Person person : persons) {
            if (totalPred.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
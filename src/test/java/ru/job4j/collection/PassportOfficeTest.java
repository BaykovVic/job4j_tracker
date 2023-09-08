package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddExistingPassport() {
        PassportOffice office = new PassportOffice();
        Citizen citizen1 = new Citizen("111", "Vasya Pupkin");
        Citizen citizen2 = new Citizen("111", "Ivan Pupkin");
        office.add(citizen1);
        boolean expected = office.add(citizen2);
        assertThat(office.get(citizen1.getPassport())).isEqualTo(citizen1);
        assertThat(expected).isFalse();
    }
}
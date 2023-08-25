package ru.job4j.ex;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {

    @Test
    public void whenWithoutException() {
        int expected = 6;
        int result = new Fact().calc(3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenException() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-1);
                }
        );
        assertThat(ex.getMessage()).isEqualTo("N could not be less than 0");
    }

}

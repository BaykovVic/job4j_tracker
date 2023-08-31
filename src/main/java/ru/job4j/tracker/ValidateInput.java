package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String question) {
        boolean isInvalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                isInvalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid data");
            }
        } while (isInvalid);
        return value;
    }

}

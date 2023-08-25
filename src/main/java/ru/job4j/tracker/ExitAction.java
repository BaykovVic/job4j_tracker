package ru.job4j.tracker;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output output) {
        this.out = output;
    }

    @Override
    public String name() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Exit Program ===");
        return false;
    }
}
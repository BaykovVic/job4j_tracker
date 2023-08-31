package ru.job4j.tracker;

public class StartUI {

    private final Output out;

    public StartUI(Output output) {
        this.out = output;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select:");
            if (select < 0 || select >= actions.length) {
                out.println("Incorrect input. Enter number from 0 to " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }

    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int i = 0; i < actions.length; i++) {
            out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new EditAction(output),
                new DeleteAction(output),
                new FindByNameAction(output),
                new FindByIdAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}
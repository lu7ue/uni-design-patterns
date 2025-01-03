package src.main.java.command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    private List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            command.execute();
        }
        commandQueue.clear();
    }
}

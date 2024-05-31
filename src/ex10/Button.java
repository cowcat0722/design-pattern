package ex10;

import ex10.command.Command;

// Intvoker 역할
public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}

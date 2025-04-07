package org.javatips.patterns.invoker;

import org.javatips.patterns.command.ICommand;

// Invoker
public class RemoteControl {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

package org.javatips.patterns.command;

import org.javatips.patterns.receiver.Light;

// Concrete Command
public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
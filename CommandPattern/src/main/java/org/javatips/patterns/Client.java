package org.javatips.patterns;

import org.javatips.patterns.invoker.RemoteControl;
import org.javatips.patterns.command.ICommand;
import org.javatips.patterns.command.LightOnCommand;
import org.javatips.patterns.receiver.Light;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        ICommand lightOn = new LightOnCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton();
    }
}

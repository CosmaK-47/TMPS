package org.example.domain.command;

public class CarRemote {

    private CarCommand command;

    public void setCommand(CarCommand command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null)
            command.execute();
        else
            System.out.println("No command assigned.");
    }
}
package ru.gb.gbchat.message;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractMessage implements Serializable {
    private final Command command;
    private final LocalDateTime timestamp;

    public AbstractMessage(Command command) {
        this.command = command;
        timestamp = LocalDateTime.now();
    }

    public Command getCommand() {
        return command;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}

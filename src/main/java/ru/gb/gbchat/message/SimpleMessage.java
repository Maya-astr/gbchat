package ru.gb.gbchat.message;

public class SimpleMessage extends AbstractMessage {
    private final String message;
    private final String nickFrom;

    private SimpleMessage(String message, String nickFrom) {
        super(Command.MESSAGE);
        this.message = message;
        this.nickFrom = nickFrom;
    }

    public String getMessage() {
        return message;
    }

    public String getNickFrom() {
        return nickFrom;
    }

    public static SimpleMessage of(String message, String nickFrom) {
        return new SimpleMessage(message, nickFrom);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BroadcastMessage{");
        sb.append("timestamp=").append(getTimestamp());
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

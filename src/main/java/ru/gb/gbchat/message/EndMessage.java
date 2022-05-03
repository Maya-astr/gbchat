package ru.gb.gbchat.message;

public class EndMessage extends AbstractMessage {
    private EndMessage() {
        super(Command.END);
    }

    public static EndMessage of() {
        return new EndMessage();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EndMessage{");
        sb.append("timestamp=").append(getTimestamp());
        sb.append('}');
        return sb.toString();
    }
}

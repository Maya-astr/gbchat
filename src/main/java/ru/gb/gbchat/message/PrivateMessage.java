package ru.gb.gbchat.message;

public class PrivateMessage extends AbstractMessage {

    private final String nickTo;
    private final String nickFrom;
    private final String message;

    private PrivateMessage(String nickTo, String nickFrom, String message) {
        super(Command.PRIVATE_MESSAGE);
        this.nickTo = nickTo;
        this.nickFrom = nickFrom;
        this.message = message;
    }

    public String getNickTo() {
        return nickTo;
    }

    public String getNickFrom() {
        return nickFrom;
    }

    public String getMessage() {
        return message;
    }

    public static PrivateMessage of(String nickTo, String nickFrom, String message) {
        return new PrivateMessage(nickTo, nickFrom, message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PrivateMessage{");
        sb.append("timestamp=").append(getTimestamp());
        sb.append(", nickTo='").append(nickTo).append('\'');
        sb.append(", nickFrom='").append(nickFrom).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

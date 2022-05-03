package ru.gb.gbchat.message;

public class ErrorMessage extends AbstractMessage {

    private final String error;

    private ErrorMessage(String error) {
        super(Command.ERROR);
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public static ErrorMessage of(String error) {
        return new ErrorMessage(error);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorMessage{");
        sb.append("timestamp=").append(getTimestamp());
        sb.append(", error='").append(error).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

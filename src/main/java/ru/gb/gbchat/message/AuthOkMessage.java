package ru.gb.gbchat.message;

public class AuthOkMessage extends AbstractMessage {

    private final String nick;

    private AuthOkMessage(String nick) {
        super(Command.AUTHOK);
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public static AuthOkMessage of(String nick) {
        return new AuthOkMessage(nick);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthOkMessage{");
        sb.append("timestamp=").append(getTimestamp());
        sb.append(", nick='").append(nick).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

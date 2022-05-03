package ru.gb.gbchat.message;

public class AuthMessage extends AbstractMessage {
    private final String login;
    private final String password;

    private AuthMessage(String login, String password) {
        super(Command.AUTH);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static AuthMessage of(String login, String password) {
        return new AuthMessage(login, password);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthMessage{");
        sb.append("timestamp=").append(getTimestamp());
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

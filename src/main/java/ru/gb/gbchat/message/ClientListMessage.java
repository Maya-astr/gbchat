package ru.gb.gbchat.message;

import java.util.Collection;

public class ClientListMessage extends AbstractMessage {

    private Collection<String> clients;

    private ClientListMessage(Collection<String> clients) {
        super(Command.CLIENTS);
        this.clients = clients;
    }

    public Collection<String> getClients() {
        return clients;
    }

    public static ClientListMessage of(Collection<String> clients) {
        return new ClientListMessage(clients);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientListMessage{");
        sb.append("clients=").append(clients);
        sb.append('}');
        return sb.toString();
    }
}

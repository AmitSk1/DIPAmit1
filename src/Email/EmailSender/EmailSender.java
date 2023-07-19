package Email.EmailSender;

import Email.Clients.Interfaces.IClient;

public class EmailSender {
    IClient client;

    public EmailSender(IClient client) {
        this.client = client;
    }

    public void send(String emailAdress, String message) {
        this.client.send(emailAdress, message);
    }

}

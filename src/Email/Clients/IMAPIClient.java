package Email.Clients;

import Email.Clients.Interfaces.IClient;

public class IMAPIClient implements IClient {


    @Override
    public void send(String emailAdress, String message) {
        System.out.println("Send through IMAP ");
    }
}

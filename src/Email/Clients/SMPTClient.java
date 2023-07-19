package Email.Clients;

import Email.Clients.Interfaces.IClient;

public class SMPTClient implements IClient {


    @Override
    public void send(String emailAdress, String message) {
        System.out.println("this is the message" + message);
        System.out.println("Send through SMPT ");

    }
}

package Email;

import Email.Clients.Interfaces.IClient;
import Email.Clients.SMPTClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String emailSender = getUserEmail();
        String message = getUserMessage();
        IClient iClient = new SMPTClient();
        iClient.send(emailSender, message);

    }
    public static String getUserEmail(){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter you email:");
        String emailSender = reader.next();
        return emailSender;
    }
    public static String getUserMessage(){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter you message:");
        String message = reader.next();
        return message;
    }


}

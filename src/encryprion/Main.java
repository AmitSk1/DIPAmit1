package encryprion;

import encryprion.encryptionMethod.Atbash;
import encryprion.encryptionMethod.CeaserEncryption;
import encryprion.encryptions.Encryption;
import encryprion.interfaces.IEncryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput = getUserInput();
        IEncryption encryptionCeaser = new CeaserEncryption(getUserShift());
        Encryption encryptCeaser = new Encryption(encryptionCeaser);
        String encryptedCeaser = encryptCeaser.encrypt(userInput);
        System.out.println("Encrypt for ceaser: " + encryptedCeaser);

        System.out.println("########################################");
        IEncryption encryptionAtbash = new Atbash();
        Encryption encryptAtBash = new Encryption(encryptionAtbash);
        String encryptedAtBash = encryptAtBash.encrypt(getUserInput());


        System.out.println("Encrypt for AtBash: " + encryptedAtBash);


    }


    private static int getUserShift() {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter shift:");
        int shift = reader.nextInt();
        return shift;
    }

    public static String getUserInput() {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter input:");
        String userInput = reader.next();
        return userInput;
    }

}

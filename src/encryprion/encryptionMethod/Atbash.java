package encryprion.encryptionMethod;

import encryprion.interfaces.IEncryption;

public class Atbash implements IEncryption {

    public Atbash() {
    }

    @Override
    public String encrytion(String userInput) {
        String encryptedText = "";

        for (char ch : userInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    ch = (char) ('a' + ('z' - ch)); // Reverse the letter in the alphabet for lowercase characters
                } else {
                    ch = (char) ('A' + ('Z' - ch)); // Reverse the letter in the alphabet for uppercase characters
                }
            }
            encryptedText += ch;
        }

        return encryptedText;
    }
}

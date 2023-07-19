package encryprion.encryptionMethod;

import encryprion.interfaces.IEncryption;

public class CeaserEncryption implements IEncryption {
    public int shift;

    public CeaserEncryption(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrytion(String userInput) {
        String encrypted = "";
        for (char i : userInput.toCharArray()) {
            encrypted += (char) (this.shift + i);
        }
        return encrypted;
    }
}

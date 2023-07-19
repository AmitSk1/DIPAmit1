package encryprion.encryptions;

import encryprion.interfaces.IEncryption;

public class Encryption {

    public IEncryption iEncryption;

    public Encryption(IEncryption iEncryption) {
        this.iEncryption = iEncryption;
    }

    public String encrypt(String userInput) {
        return  this.iEncryption.encrytion(userInput);
    }
}

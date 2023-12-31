package main.java.CTR;

/**
 * main.java.CTR.Cipher class that uses built-in Javax library main.java.CTR.Cipher instances.
 */
public abstract class JavaxCipher extends Cipher {
    /**
     * Javax crypto instance.
     */
    protected javax.crypto.Cipher m_cipher;

    /**
     * Javax secret key spec instance.
     */
    protected javax.crypto.spec.SecretKeySpec m_keySpec;


    /**
     * Default constructor.
     *
     * @throws Exception
     */
    public JavaxCipher() throws Exception {

    }
}

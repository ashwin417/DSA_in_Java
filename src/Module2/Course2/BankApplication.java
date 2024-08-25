package Module2.Course2;

import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String customerId;
    private String name;
    private transient String password;

    public Customer(String customerId, String name, String password) {
        this.customerId = customerId;
        this.name = name;
        this.password = password;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}

class EncryptionUtil {
    private static final String ALGORITHM = "AES";
    private static final String KEY = "1234567890123456"; // 16-byte key for AES

    public static byte[] encrypt(byte[] data) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(data);
    }

    public static byte[] decrypt(byte[] encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return cipher.doFinal(encryptedData);
    }
}

public class BankApplication {

    public static void serializeCustomer(Customer customer, String filePath) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(customer);
        oos.close();

        byte[] encryptedData = EncryptionUtil.encrypt(baos.toByteArray());

        FileOutputStream fos = new FileOutputStream(filePath);
        fos.write(encryptedData);
        fos.close();
    }

    public static Customer deserializeCustomer(String filePath) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        byte[] encryptedData = fis.readAllBytes();
        fis.close();

        byte[] decryptedData = EncryptionUtil.decrypt(encryptedData);

        ByteArrayInputStream bais = new ByteArrayInputStream(decryptedData);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Customer customer = (Customer) ois.readObject();
        ois.close();

        return customer;
    }

    public static void main(String[] args) {
        try {
            Customer customer = new Customer("C007", "Blah", "securePassword123");

            String filePath = "customer_data.ser";

            serializeCustomer(customer, filePath);
            System.out.println("Customer data serialized and encrypted successfully.");

            Customer deserializedCustomer = deserializeCustomer(filePath);
            System.out.println("Customer data deserialized and decrypted successfully.");

            System.out.println("Deserialized Customer: " + deserializedCustomer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

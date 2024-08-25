package Module2.Course2.Assignment3;

import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            DataPacket packet = (DataPacket) in.readObject(); // Deserialize the object
            System.out.println("Data received: " + packet);

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package Module2.Course2.Assignment3;

import java.io.Serializable;

public class DataPacket implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures compatibility during deserialization

    private String message;
    private int id;

    public DataPacket(String message, int id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DataPacket [message=" + message + ", id=" + id + "]";
    }
}

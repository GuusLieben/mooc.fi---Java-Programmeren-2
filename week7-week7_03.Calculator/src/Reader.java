import java.util.*;

public class Reader {
    private Scanner reader = new Scanner(System.in);

    public String readString() {
        return reader.nextLine();
    }
    public int readInt() {
        return Integer.parseInt(reader.nextLine());
    }
}

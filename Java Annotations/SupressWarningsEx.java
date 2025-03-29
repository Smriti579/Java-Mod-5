import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list = new ArrayList();  // Raw type warning suppressed
        list.add("Java");
    }
}

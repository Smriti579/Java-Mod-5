import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface ToDo {
    String value();
}

public class Task {
    @ToDo("Refactor this method")
    public void process() {
        // Some logic here
    }
}

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecution {}

class Service {
    @LogExecution
    public void process() {
        System.out.println("Processing...");
    }
}

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = Service.class.getMethod("process");
        if (method.isAnnotationPresent(LogExecution.class)) {
            System.out.println("Method has @LogExecution annotation");
        }
    }
}

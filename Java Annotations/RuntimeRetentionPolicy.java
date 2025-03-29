import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecution {}

class Service {
    @LogExecution
    public void execute() {
        System.out.println("Executing method...");
    }
}

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = Service.class.getMethod("execute");
        if (method.isAnnotationPresent(LogExecution.class)) {
            System.out.println("Method is annotated with @LogExecution");
        }
    }
}

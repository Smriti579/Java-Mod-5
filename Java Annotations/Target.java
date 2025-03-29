import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)  // Can only be applied to methods
@interface LogExecution {}

class Service {
    @LogExecution
    public void process() {
        System.out.println("Processing...");
    }
}

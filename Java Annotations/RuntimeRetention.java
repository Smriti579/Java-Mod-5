import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface RunTimeAnnotation {}

class Example {
    @RunTimeAnnotation
    public void display() {}
}

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = Example.class.getMethod("display");
        if (method.isAnnotationPresent(RunTimeAnnotation.class)) {
            System.out.println("Annotation is available at runtime!");
        }
    }
}

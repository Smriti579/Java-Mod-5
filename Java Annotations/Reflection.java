import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}

class Example {
    @MyAnnotation(value = "Hello Reflection!")
    public void display() {}
}

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = Example.class.getMethod("display");
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation Value: " + annotation.value());
        }
    }
}

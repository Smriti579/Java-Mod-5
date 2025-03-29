import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.TYPE)  // Can be used only on classes
@interface DeveloperInfo {
    String author();
    String date();
    int version() default 1;  // Default value
}
// Applying the annotation to a class
@DeveloperInfo(author = "Smriti Mahajan", date = "2025-03-29", version = 2)
class MyClass {
    void display() {
        System.out.println("Hello from MyClass");
    }
}
// Retrieving annotation values using reflection
public class AnnotationProcessor {
    public static void main(String[] args) {
        Class<MyClass> obj = MyClass.class;
        if (obj.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = obj.getAnnotation(DeveloperInfo.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
            System.out.println("Version: " + info.version());
        }
    }
}

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@interface CompileTimeAnnotation {}

public class Example {
    @CompileTimeAnnotation
    public void display() {}
}

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@interface Generated {
    String author();
}

public class Sample {
    @Generated(author = "Smriti")
    public void compute() {}
}

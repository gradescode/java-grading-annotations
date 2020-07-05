package gradescode.gradingannotations;

import java.lang.annotation.*;

/**
 * Indicate the score value of a unit test.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Score {
    int value();
}

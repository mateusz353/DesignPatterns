package pl.com.ugeon.builder.lombok;

import lombok.Builder;
import lombok.Value;

/**
 * Created by mateusz on 31.05.18.
 */
@Value
@Builder
public class User {
    private int age;
    private int height;
    private int weight;
    private String name;
    private String surname;
}

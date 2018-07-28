package pl.com.draft.qualifier.ownqualifier;

import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 7/28/2018.
 */
@Component
@AnimalQualifier(AnimalType.DEER)
public class Deer implements Animal {
    @Override
    public void printName() {
        System.out.println("---  Deer  ---");
    }
}

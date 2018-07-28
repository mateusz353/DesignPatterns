package pl.com.draft.qualifier.ownqualifier;

import org.springframework.stereotype.Component;

/**
 * Created by Mateusz on 7/28/2018.
 */
@Component
@AnimalQualifier(AnimalType.FOX)
public class Fox implements Animal {
    @Override
    public void printName() {
        System.out.println("---  Fox  ---");
    }
}

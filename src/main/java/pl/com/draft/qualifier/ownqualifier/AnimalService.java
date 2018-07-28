package pl.com.draft.qualifier.ownqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 7/28/2018.
 */
@Service
public class AnimalService {

    @Autowired
    @AnimalQualifier(AnimalType.DEER)
    private Animal deer;

    @Autowired
    @AnimalQualifier(AnimalType.FOX)
    private Animal fox;

    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(deer);
        animals.add(fox);
        return animals;
    }
}

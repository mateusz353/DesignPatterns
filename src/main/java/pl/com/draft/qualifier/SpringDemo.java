package pl.com.draft.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.com.draft.qualifier.ownqualifier.AnimalService;

/**
 * Created by Mateusz on 7/28/2018.
 */
public class SpringDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        AnimalService animal = ctx.getBean(AnimalService.class);
        animal.getAnimals().forEach(item -> item.printName());
        ctx.close();
    }

}


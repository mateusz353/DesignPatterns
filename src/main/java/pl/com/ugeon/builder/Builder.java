package pl.com.ugeon.builder;

import pl.com.ugeon.builder.lombok.User;
import pl.com.ugeon.builder.self.Actor;

/**
 * Created by mateusz on 31.05.18.
 */
public class Builder {

    public static void main( String[] args ){
        Actor.ActorBuilder actorBuilder = new Actor.ActorBuilder("Lubaszenko");

        Actor goodActor = actorBuilder
                .withName("Olaf")
                .withAge(60)
                .withHeight(190)
                .withWeight(110).build();

        System.out.println(goodActor.toString());

        User user = User.builder()
                .surname("Lubaszenko")
                .name("Olaf")
                .age(60)
                .height(190)
                .weight(110).build();

        System.out.println(user.toString());
    }
}

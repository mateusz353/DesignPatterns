package pl.com.ugeon.builder.self;

/**
 * Created by mateusz on 31.05.18.
 */
public class Actor {
    private int age;
    private int height;
    private int weight;
    private String name;
    private String surname;

    private Actor(ActorBuilder builder) {
        this.age = builder.getAge();
        this.height = builder.getHeight();
        this.weight = builder.getWeight();
        this.name = builder.getName();
        this.surname = builder.getSurname();
   }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class ActorBuilder{

        private int age;
        private int height;
        private int weight;
        private String name;
        private String surname;

        public ActorBuilder(String surname){
            this.surname = surname;
        }

        public ActorBuilder withAge(int age){
            this.age = age;
            return this;
        }

        public ActorBuilder withHeight(int height){
            this.height = height;
            return this;
        }

        public ActorBuilder withWeight(int weight){
            this.weight = weight;
            return this;
        }

        public ActorBuilder withName(String name){
            this.name = name;
            return this;
        }

        public Actor build(){
            return new Actor(this);
        }

        private int getAge() {
            return age;
        }

        private int getHeight() {
            return height;
        }

        private int getWeight() {
            return weight;
        }

        private String getName() {
            return name;
        }

        private String getSurname() {
            return surname;
        }
    }
}

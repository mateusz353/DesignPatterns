package pl.com.ugeon.flyweight.platform;

/**
 * @author Mateusz Nowakowski.
 */
public class JavaPlatform implements Platform {

    public JavaPlatform(){
        System.out.println("JavaPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Java code.");
    }

}
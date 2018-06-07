package pl.com.ugeon.flyweight.platform;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class RubyPlatform implements Platform {

    public RubyPlatform(){
        System.out.println("RubyPlatform object created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("Compiling and executing Ruby code.");
    }

}
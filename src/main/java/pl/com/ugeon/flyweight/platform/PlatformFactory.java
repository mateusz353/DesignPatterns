package pl.com.ugeon.flyweight.platform;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public final class PlatformFactory {

    private static Map<String, Platform> map = new HashMap<>();
    private PlatformFactory(){
        throw new AssertionError("Cannot instantiate the class");
    }

    public static synchronized Platform getPlatformInstance(String platformType){
        Platform platform = map.get(platformType);
        if(platform==null){
            switch(platformType){
                case "C" : platform = new CPlatform();
                    break;
                case "CPP" : platform = new CPPPlatform();
                    break;
                case "JAVA" : platform = new JavaPlatform();
                    break;
                case "RUBY" : platform = new RubyPlatform();
                    break;
            }
            map.put(platformType, platform);
        }
        return platform;
    }

}
package pl.com.ugeon.singleton;

/**
 * Created by mateusz on 01.06.18.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){};

    //thread safety
    public static Singleton getInstance(){
        return instance;
    }

    //lazy loading, no thread safety
    private static Singleton lazyInstance;

    public static Singleton getLazyInstance()
    {
        if(lazyInstance == null){
            lazyInstance = new Singleton();
        }
        return lazyInstance;
    }

}

package pl.com.draft.time;

/**
 * @author Mateusz Nowakowski.
 */
public class EmptyMethodVsIfComparison {

    public static void main( String[] args ){

        SimpleClass simpleClassNotAssign = null;
        SimpleClass simpleClassAssign = new SimpleClass();
        SimpleClass simpleClassAssign2 = new SimpleClass();
        long start, stop;

        start=System.nanoTime();
        if(simpleClassNotAssign != null){}
        stop=System.nanoTime();
        System.out.println("Czas wykonania (w nanosekundach): "+(stop-start));

        start=System.nanoTime();
        simpleClassAssign.doSomething();
        stop=System.nanoTime();
        System.out.println("Czas wykonania (w nanosekundach): "+(stop-start));


        start=System.nanoTime();
        if(simpleClassAssign2 != null){
            simpleClassAssign2.doSomething();
        }
        stop=System.nanoTime();
        System.out.println("Czas wykonania (w nanosekundach): "+(stop-start));
    }


}
package pl.com.ugeon.iterator;

import pl.com.ugeon.iterator.repository.Iterator;
import pl.com.ugeon.iterator.repository.NameRepository;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
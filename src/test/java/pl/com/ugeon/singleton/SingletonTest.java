package pl.com.ugeon.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mateusz on 01.06.18.
 */
public class SingletonTest {

    private Singleton sone = null, stwo = null;

    @Before
    public void setUp() {
        sone = Singleton.getInstance();
        stwo = Singleton.getInstance();
    }

    @Test
    public void testUnique() {
        Assert.assertTrue(sone == stwo);
    }

}
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Travis Brindley on 7/27/2017.
 */
public class TDDPracticeTest {

    @Test
    public void testIsPrimeTrue(){
        TDDPractice tddPractice = new TDDPractice();
        boolean expected = true;
        boolean actual = tddPractice.isPrime(3);
        assertEquals(expected,actual);
    }

    @Test
    public void testIsPrimeFalse(){
        TDDPractice tddPractice = new TDDPractice();
        boolean expected = false;
        boolean actual = tddPractice.isPrime(4);
        assertEquals(expected,actual);
    }

    @Test
    public void testReturn(){
        TDDPractice tddPractice = new TDDPractice();
        int expected = 3;
        int actual = tddPractice.primeNumber(2);
        assertEquals(expected,actual);
    }

}
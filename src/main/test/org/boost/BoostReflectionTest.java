package org.boost;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoostReflectionTest {
    private long MAX_TIME = (long) 4500.00;

    @Test
    public void BoostReflectionSpeedTest() throws InterruptedException {
        long timeStart = System.currentTimeMillis();
        // TODO: inserisci qui il codice
        Thread.sleep(5000);
        long timeElapsed = System.currentTimeMillis() - timeStart;
        assertTrue(timeElapsed < MAX_TIME );
    }
}

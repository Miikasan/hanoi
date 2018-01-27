package cfranc.hanoi;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

public class DisqueTest {

    @Test
    public void testCompareTo() {
            Disque petit = new Disque(1);
            Disque petit2 = new Disque(1);
            Disque moyen = new Disque(2);
            Disque grand = new Disque(3);
            
            assertEquals(0, petit.compareTo(petit2));
            assertEquals(-1, petit.compareTo(moyen));
            assertEquals(-1, moyen.compareTo(grand));
            assertEquals(1, grand.compareTo(moyen));
            assertEquals(1, moyen.compareTo(petit));
    }
}

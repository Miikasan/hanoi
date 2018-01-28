package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    @Test
    public void test() {



    }

    /**
     * Test of empiler method, of class Tour.
     */
    @org.junit.Test
    public void testEmpilerTrueTrue() {
        System.out.println("empiler");
    
        Tour instance = new Tour(); //hauteur 3, taille() = 2
        
        Disque d1 = new Disque(3);
        instance.empiler(d1);
        Disque d2 = new Disque(2);
        instance.empiler(d2);
        Disque d3 = new Disque(1); //d.d = diam() - 1
        boolean expResult = true;
        boolean result = instance.empiler(d3);
        assertEquals(expResult, result);
    }
    public void testEmpilerTrueFalse() {
        System.out.println("empiler");
        
        Tour instance = new Tour(); //hauteur 3, taille() = 2
        
        Disque d1 = new Disque(3);
        instance.empiler(d1);
        Disque d2 = new Disque(2);
        instance.empiler(d2);
        Disque d3 = new Disque(2); //d.d = diam()
        boolean expResult = false;
        boolean result = instance.empiler(d3);
        assertEquals(expResult, result);
    }
    
    public void testEmpilerFalseTrue() {
        System.out.println("empiler");
        
        Tour instance = new Tour(); //hauteur 3, taille() = 2
        
        Disque d1 = new Disque(4);
        instance.empiler(d1);
        Disque d2 = new Disque(3);
        instance.empiler(d2);
        Disque d3 = new Disque(2);
        instance.empiler(d3);
        Disque d4 = new Disque(1); 
        boolean expResult = false;
        boolean result = instance.empiler(d4); //On empile plus de disque que la hauteurMax
        assertEquals(expResult, result);
    }
    
    public void testEmpilerFalseFalse() {
        System.out.println("empiler");
        
        Tour instance = new Tour(); //hauteur 3, taille() = 2
        
        Disque d1 = new Disque(4);
        instance.empiler(d1);
        Disque d2 = new Disque(3);
        instance.empiler(d2);
        Disque d3 = new Disque(2);
        instance.empiler(d3);
        Disque d4 = new Disque(2); //d.d = diam() et 2 disques de même hauteur
        boolean expResult = false;
        boolean result = instance.empiler(d4);
        assertEquals(expResult, result);
    }
    
    public void testdiam() {
        System.out.println("empiler");
        
        Tour instance = new Tour(); //hauteur 3, taille() = 2
        
        Disque d1 = new Disque(3);
        instance.empiler(d1);
        Disque d2 = new Disque(2);
        instance.empiler(d2);
        int expResult = 2;
        int result = instance.diam();
        assertEquals(expResult, result);
    }

}

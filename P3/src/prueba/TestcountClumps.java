package prueba;

import ejemplo.P3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
public class TestcountClumps {
    private P3 p3;
    @Before
    public void setUp() throws Exception {
        p3 = new P3();


    }
    @Test
    public void whenArrayisNullReturnZero(){
        int[] array = null;
        assertEquals("El array es null", 0 ,p3.countClumps(array));

    }
    @Test
    public void whenArrayisNotLengthGreaterThanZeroReturnszero(){
        int[] array = {};
        assertEquals("El array no tiene longitud mayor a 0", 0 ,p3.countClumps(array));

    }
    @Test
    public void whenArrayitLengthGreaterThanZeroReturnszero(){
        int[] array = {1,1,2,2,3,6,5,4,4,4};
        assertEquals("El array tiene longitud mayor a 0", 3 ,p3.countClumps(array));

    }

}

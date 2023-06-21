package prueba;

import ejemplo.P2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
public class TestcountClumps {
    //T1
    @Test
    public void whenArrayisNullReturnZero(){
        int[] array = null;
        P2 p2 = new P2();
        assertEquals("El array es null", 0 ,p2.countClumps(array));

    }
    //T2
    @Test
    public void whenArrayisNotLengthGreaterThanZeroReturnszero(){
        int[] array = {};
        P2 p2 = new P2();
        assertEquals("El array no tiene longitud mayor a 0", 0 ,p2.countClumps(array));

    }
    //T3
    @Test
    public void whenArrayitLengthGreaterThanZeroReturnszero(){
        int[] array = {1,1,2,2,3,6,5,4,4,4};
        P2 p2 = new P2();
        assertEquals("El array tiene longitud mayor a 0", 3 ,p2.countClumps(array));

    }
    //T4
    @Test
    public void whenArrayitLengthGreaterThanZeroAndHaveDiferentsElements(){
        int[] array = {1,2,3,4,5,6,7};
        P2 p2 = new P2();
        assertEquals("El array tiene longitud mayor a 0 y los elementos son diferentes", 0 ,p2.countClumps(array));

    }
    //T5
    @Test
    public void whenArrayitLengthGreaterThanZeroAndAllItsElementsAreEqual(){
        int[] array = {1,1,1,1,1,1};
        P2 p2 = new P2();
        assertEquals("El array tiene longitud mayor a 0 y todos los elementos son iguales", 1 ,p2.countClumps(array));

    }
    //T6
    @Test
    public void whenArrayitLengthGreaterThanZeroAndEqualElementsAtStartAndEnd(){
        int[] array = {1,1,1,3,5,6,7,9,9,9};
        P2 p2 = new P2();
        assertEquals(2 ,p2.countClumps(array));

    }


}

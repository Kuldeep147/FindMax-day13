package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestFindMax {
    @Test
    public void testFindMax(){
        assertEquals(3,FindMax.findMax(new Integer[] {3,1,2}));
        assertEquals(5,FindMax.findMax(new Integer[] {-6,5,-90}));
        assertEquals(3,FindMax.findMax(new Integer[] {1,2,3}));
    }
}

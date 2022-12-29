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
    @Test
    public void testFindMaxFloat(){
        assertEquals(7.09f,FindMax.findMaxFloat(new Float[] {7.09f,6.09f,3.0f}));
        assertEquals(7.09f,FindMax.findMaxFloat(new Float[] {6.09f,7.09f,3.0f}));
        assertEquals(7.09f,FindMax.findMaxFloat(new Float[] {6.09f,3.0f,7.09f}));
    }
}

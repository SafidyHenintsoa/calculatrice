package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testAddition(){
        assertEquals(3, Main.addition(1,2));
        assertEquals(4, Main.addition(2,2));
        assertEquals(5.6, Main.addition(3.3,2.3));
    }
    @Test
    public void testSubtraction(){
        assertEquals(1, Main.subtraction(2,1));
        assertEquals(0, Main.subtraction(1,1));
        assertEquals(1.3000000000000003, Main.subtraction(3.6,2.3));
    }
    @Test
    public void testMultiplication(){
        assertEquals(9, Main.multiplication(3,3));
    }
    @Test
    public void testDivision(){
        assertEquals(2, Main.division(6,3));
        assertEquals(Double.POSITIVE_INFINITY, Main.division(6,0));
    }
}
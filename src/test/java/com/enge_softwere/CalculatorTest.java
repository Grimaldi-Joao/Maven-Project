package com.enge_softwere;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        
        // Teste 1
        assertEquals(6, calculator.add(2, 3));
        
        // Teste 2
        assertEquals(10, calculator.add(5, 5));
        
        // Teste 3
        assertEquals(0, calculator.add(-5, 5));
    }
}

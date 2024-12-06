/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Cristóbal Varas
 */
public class CuotaTest {
    
    public CuotaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class Cuota.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cuota instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class Cuota.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        Cuota instance = null;
        double expResult = 0.0;
        double result = instance.getMonto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPagada method, of class Cuota.
     */
    @Test
    public void testIsPagada() {
        System.out.println("isPagada");
        Cuota instance = null;
        boolean expResult = false;
        boolean result = instance.isPagada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagada method, of class Cuota.
     */
    @Test
    public void testSetPagada() {
        System.out.println("setPagada");
        boolean pagada = false;
        Cuota instance = null;
        instance.setPagada(pagada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

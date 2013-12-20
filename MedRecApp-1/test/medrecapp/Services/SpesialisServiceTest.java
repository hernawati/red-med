/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Spesialis;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class SpesialisServiceTest {

    public SpesialisServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of serviceInsertSpesialis method, of class SpesialisService.
     */
    @Test
    public void testServiceInsertSpesialis() {
        System.out.println("serviceInsertSpesialis");
        Spesialis sp = new Spesialis();
        sp.setIdSpesialis("Sp.Mt");
        sp.setNmSpesialis("Spesialis Mata");
        sp.setTarifKonsul(70000);
        SpesialisService instance = new SpesialisService();
        instance.serviceInsertSpesialis(sp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateSpesialis method, of class SpesialisService.
     */
    @Test
    public void testServiceUpdateSpesialis() {
        System.out.println("serviceUpdateSpesialis");
        Spesialis sp = new Spesialis();
        sp.setNmSpesialis("Spesialis Penyakis Mata");
        sp.setTarifKonsul(80000);
        String idSpesialis = "Sp.Mt";
        SpesialisService instance = new SpesialisService();
        instance.serviceUpdateSpesialis(sp, idSpesialis);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeleteSpesialis method, of class SpesialisService.
     */
    @Test
    public void testServiceDeleteSpesialis() {
        System.out.println("serviceDeleteSpesialis");
        String idSpesialis = "Sp.Mt";
        SpesialisService instance = new SpesialisService();
        instance.serviceDeleteSpesialis(idSpesialis);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllSpesialis method, of class SpesialisService.
     */
//    @Test
//    public void testServiceGetAllSpesialis() {
//        System.out.println("serviceGetAllSpesialis");
//        SpesialisService instance = new SpesialisService();
//        List expResult = null;
//        List result = instance.serviceGetAllSpesialis();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceGetAllNamaSpesialis method, of class SpesialisService.
     */
//    @Test
//    public void testServiceGetAllNamaSpesialis() {
//        System.out.println("serviceGetAllNamaSpesialis");
//        int b = 0;
//        SpesialisService instance = new SpesialisService();
//        String[] expResult = null;
//        String[] result = instance.serviceGetAllNamaSpesialis(b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceGetIDSpesialis method, of class SpesialisService.
     */
//    @Test
//    public void testServiceGetIDSpesialis() {
//        System.out.println("serviceGetIDSpesialis");
//        String b = "";
//        SpesialisService instance = new SpesialisService();
//        String expResult = "";
//        String result = instance.serviceGetIDSpesialis(b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
}
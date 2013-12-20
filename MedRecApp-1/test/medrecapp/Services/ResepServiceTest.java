/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Resep;
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
public class ResepServiceTest {

    public ResepServiceTest() {
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
     * Test of serviceInsertResep method, of class ResepService.
     */
    @Test
    public void testServiceInsertResep() {
        System.out.println("serviceInsertResep");
        Resep r = new Resep();
        r.setNoResep("000000001");
        r.setNoDaftar("090920130001");
        r.setTglResep("2013-12-20");
        ResepService instance = new ResepService();
        instance.serviceInsertResep(r);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateResep method, of class ResepService.
     */
//    @Test
//    public void testServiceUpdateResep() {
//        System.out.println("serviceUpdateResep");
//        Resep r = null;
//        String noResep = "";
//        ResepService instance = new ResepService();
//        instance.serviceUpdateResep(r, noResep);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceDeleteResep method, of class ResepService.
     */
//    @Test
//    public void testServiceDeleteResep() {
//        System.out.println("serviceDeleteResep");
//        String noResep = "";
//        ResepService instance = new ResepService();
//        instance.serviceDeleteResep(noResep);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceGetAllResep method, of class ResepService.
     */
//    @Test
//    public void testServiceGetAllResep() {
//        System.out.println("serviceGetAllResep");
//        ResepService instance = new ResepService();
//        List expResult = null;
//        List result = instance.serviceGetAllResep();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
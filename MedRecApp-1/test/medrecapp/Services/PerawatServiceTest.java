/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Perawat;
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
public class PerawatServiceTest {

    public PerawatServiceTest() {
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
     * Test of serviceInsertPerawat method, of class PerawatService.
     */
    @Test
    public void testServiceInsertPerawat() {
        System.out.println("serviceInsertPerawat");
        Perawat p = new Perawat();
        p.setNoPerawat("PER.003");
        p.setNmPerawat("Lina Meiga");
        p.setTglKerjaPer("2012-09-03");
        p.setIdUnitRs("POLI BEDAH");
        PerawatService instance = new PerawatService();
        instance.serviceInsertPerawat(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdatePerawat method, of class PerawatService.
     */
    @Test
    public void testServiceUpdatePerawat() {
        System.out.println("serviceUpdatePerawat");
        Perawat p = new Perawat();
        p.setNmPerawat("Linawati");
        p.setTglKerjaPer("2011-03-05");
        p.setIdUnitRs("POLI DALAM");
        String noPerawat = "PER.002";
        PerawatService instance = new PerawatService();
        instance.serviceUpdatePerawat(p, noPerawat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeletePerawat method, of class PerawatService.
     */
    @Test
    public void testServiceDeletePerawat() {
        System.out.println("serviceDeletePerawat");
        String noPerawat = "PER.003";
        PerawatService instance = new PerawatService();
        instance.serviceDeletePerawat(noPerawat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllDokter method, of class PerawatService.
     */
//    @Test
//    public void testServiceGetAllDokter() {
//        System.out.println("serviceGetAllDokter");
//        PerawatService instance = new PerawatService();
//        List expResult = null;
//        List result = instance.serviceGetAllDokter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
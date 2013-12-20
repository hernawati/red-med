/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Obat;
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
public class ObatServiceTest {

    public ObatServiceTest() {
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
     * Test of serviceInsertObat method, of class ObatService.
     */
    @Test
    public void testServiceInsertObat() {
        System.out.println("serviceInsertObat");
        Obat o = new Obat();
        o.setIdObat("PROMAG");
        o.setKetObat("Obat untuk sakit obat maag");
        ObatService instance = new ObatService();
        instance.serviceInsertObat(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateObat method, of class ObatService.
     */
    @Test
    public void testServiceUpdateObat() {
        System.out.println("serviceUpdateObat");
        Obat o = new Obat();
        o.setKetObat("Obat bentuk tablet untuk sakit maag");
        String idObat = "PROMAG";
        ObatService instance = new ObatService();
        instance.serviceUpdateObat(o, idObat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeleteObat method, of class ObatService.
     */
    @Test
    public void testServiceDeleteObat() {
        System.out.println("serviceDeleteObat");
        String idObat = "PROMAG";
        ObatService instance = new ObatService();
        instance.serviceDeleteObat(idObat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllDokter method, of class ObatService.
     */
//    @Test
//    public void testServiceGetAllDokter() {
//        System.out.println("serviceGetAllDokter");
//        ObatService instance = new ObatService();
//        List expResult = null;
//        List result = instance.serviceGetAllDokter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
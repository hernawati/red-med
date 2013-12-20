/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Dokter;
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
public class DokterServiceTest {

    public DokterServiceTest() {
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
     * Test of serviceInsertDokter method, of class DokterService.
     */
    @Test
    public void testServiceInsertDokter() {
        System.out.println("serviceInsertDokter");
        Dokter d = new Dokter();
        d.setNoDokter("DOK.005");
        d.setNmDokter("dr. Lisa Sulistine");
        d.setIdSpesialis("Sp.J");
        d.setTglKerjaDok("2008-09-25");
        d.setAlamatDok("Jl. Belimbing No. 78 Jakarta Utara");
        DokterService instance = new DokterService();
        instance.serviceInsertDokter(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateDokter method, of class DokterService.
     */
    @Test
    public void testServiceUpdateDokter() {
        System.out.println("serviceUpdateDokter");
        Dokter d = new Dokter();
        d.setNmDokter("dr. Lisa Sulistiyani");
        d.setIdSpesialis("Sp.B");
        d.setTglKerjaDok("2006-04-14");
        d.setAlamatDok("Jl. Belimbing No. 90 Jakarta Selatan");
        String noDokter = "DOK.005";
        DokterService instance = new DokterService();
        instance.serviceUpdateDokter(d, noDokter);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeleteDokter method, of class DokterService.
     */
    @Test
    public void testServiceDeleteDokter() {
        System.out.println("serviceDeleteDokter");
        String noDokter = "DOK.005";
        DokterService instance = new DokterService();
        instance.serviceDeleteDokter(noDokter);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllDokter method, of class DokterService.
     */
//    @Test
//    public void testServiceGetAllDokter() {
//        System.out.println("serviceGetAllDokter");
//        DokterService instance = new DokterService();
//        List expResult = null;
//        List result = instance.serviceGetAllDokter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

}
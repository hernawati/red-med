/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Pasien;
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
public class PasienServiceTest {

    public PasienServiceTest() {
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
     * Test of serviceInsertPasien method, of class PasienService.
     */
    @Test
    public void testServiceInsertPasien() {
        System.out.println("serviceInsertPasien");
        Pasien p = new Pasien();
        p.setNoRm("000005");
        p.setNmPas("Harun Yahya");
        p.setJkPas("L");
        p.setTglLahir("1990-09-23");
        p.setAgama("Islam");
        p.setAlamatPas("Jl. Merdeka No. 73 Bandung");
        PasienService instance = new PasienService();
        instance.serviceInsertPasien(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdatePasien method, of class PasienService.
     */
    @Test
    public void testServiceUpdatePasien() {
        System.out.println("serviceUpdatePasien");
        Pasien p = new Pasien();
        p.setNmPas("Hasan Sadikin");
        p.setJkPas("L");
        p.setTglLahir("1991-09-12");
        p.setAgama("Islam");
        p.setAlamatPas("Jl. Kebangsaan Timur No. 99 Jakarta");
        String noRm = "000005";
        PasienService instance = new PasienService();
        instance.serviceUpdatePasien(p, noRm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeletePasien method, of class PasienService.
     */
    @Test
    public void testServiceDeletePasien() {
        System.out.println("serviceDeletePasien");
        String noRm = "000005";
        PasienService instance = new PasienService();
        instance.serviceDeletePasien(noRm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllPasien method, of class PasienService.
     */
//    @Test
//    public void testServiceGetAllPasien() {
//        System.out.println("serviceGetAllPasien");
//        PasienService instance = new PasienService();
//        List expResult = null;
//        List result = instance.serviceGetAllPasien();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Staf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tikes03
 */
public class StafServiceTest {

    public StafServiceTest() {
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
     * Test of serviceInsertStaf method, of class StafService.
     */
    @Test
    public void testServiceInsertStaf() {
        System.out.println("serviceInsertStaf");
        Staf s = new Staf();
        s.setNoStaf("STF.003");
        s.setNmStaf("Waluyo");
        s.setAlamatStaf("Medan");
        StafService instance = new StafService();
        instance.serviceInsertStaf(s);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateDokter method, of class StafService.
     */
    @Test
    public void testServiceUpdateDokter() {
        System.out.println("serviceUpdateDokter");
        Staf s = new Staf();
        s.setNmStaf("Joko Santoso");
        s.setAlamatStaf("Bandung");
        String noStaf = "STF.003";
        StafService instance = new StafService();
        instance.serviceUpdateDokter(s, noStaf);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeleteStaf method, of class StafService.
     */
    @Test
    public void testServiceDeleteStaf() {
        System.out.println("serviceDeleteStaf");
        String noStaf = "STF.003";
        StafService instance = new StafService();
        instance.serviceDeleteStaf(noStaf);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllDokter method, of class StafService.
     */
//    @Test
//    public void testServiceGetAllDokter() {
//        System.out.println("serviceGetAllDokter");
//        StafService instance = new StafService();
//        List expResult = null;
//        List result = instance.serviceGetAllDokter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
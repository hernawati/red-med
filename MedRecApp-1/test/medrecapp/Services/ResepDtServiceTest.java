/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.ResepDt;
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
public class ResepDtServiceTest {

    public ResepDtServiceTest() {
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
     * Test of serviceInsertResepDt method, of class ResepDtService.
     */
//    @Test
//    public void testServiceInsertResepDt() {
//        System.out.println("serviceInsertResepDt");
//        ResepDt r = new ResepDt();
//        r.setNoResep("000000001");
//        r.setIdObat("AMOXILYN 200mg");
//        r.setSatuanKons("3x1");
//        r.setDosisKons("1 Tablet");
//        r.setJumlah(12);
//
//        ResepDtService instance = new ResepDtService();
//        instance.serviceInsertResepDt(r);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceUpdateResepDt method, of class ResepDtService.
     */
//    @Test
//    public void testServiceUpdateResepDt() {
//        System.out.println("serviceUpdateResepDt");
//        ResepDt r = new ResepDt();
//        r.setIdObat("AMOXILYN 200mg");
//        r.setSatuanKons("3x1");
//        r.setDosisKons("1 Tablet");
//        r.setJumlah(15);
//
//        String noResep = "000000001";
//        ResepDtService instance = new ResepDtService();
//        instance.serviceUpdateResepDt(r, noResep);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceDeleteResepDt method, of class ResepDtService.
     */
    @Test
    public void testServiceDeleteResepDt() {
        System.out.println("serviceDeleteResepDt");
        String noResep = "000000001";
        ResepDtService instance = new ResepDtService();
        instance.serviceDeleteResepDt(noResep);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllResep method, of class ResepDtService.
     */
//    @Test
//    public void testServiceGetAllResep() {
//        System.out.println("serviceGetAllResep");
//        ResepDtService instance = new ResepDtService();
//        List expResult = null;
//        List result = instance.serviceGetAllResep();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
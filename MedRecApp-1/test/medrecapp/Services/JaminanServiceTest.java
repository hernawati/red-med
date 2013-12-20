/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.Jaminan;
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
public class JaminanServiceTest {

    public JaminanServiceTest() {
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
     * Test of serviceInsertJaminan method, of class JaminanService.
     */
    @Test
    public void testServiceInsertJaminan() {
        System.out.println("serviceInsertJaminan");
        Jaminan j = new Jaminan();
        j.setIdJaminan("JPK PNS");
        j.setNmJaminan("Jaminan PK Pegawai Negeri Sipil");
        j.setKetJaminan("Jaminan kesahatan untuk pegawai negeri sipil");
        JaminanService instance = new JaminanService();
        instance.serviceInsertJaminan(j);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateJaminan method, of class JaminanService.
     */
    @Test
    public void testServiceUpdateJaminan() {
        System.out.println("serviceUpdateJaminan");
        Jaminan j = new Jaminan();
        j.setNmJaminan("Jaminan Pemeliharaan Kesehatan PNS");
        j.setKetJaminan("Jaminan kesahatan untuk pegawai negeri sipil");
        String idJaminan = "JPK PNS";
        JaminanService instance = new JaminanService();
        instance.serviceUpdateJaminan(j, idJaminan);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeleteJaminan method, of class JaminanService.
     */
    @Test
    public void testServiceDeleteJaminan() {
        System.out.println("serviceDeleteJaminan");
        String idJaminan = "JPK PNS";
        JaminanService instance = new JaminanService();
        instance.serviceDeleteJaminan(idJaminan);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceGetAllJaminan method, of class JaminanService.
     */
//    @Test
//    public void testServiceGetAllJaminan() {
//        System.out.println("serviceGetAllJaminan");
//        JaminanService instance = new JaminanService();
//        List expResult = null;
//        List result = instance.serviceGetAllJaminan();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
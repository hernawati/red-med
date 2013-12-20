/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import java.util.List;
import medrecapp.Entity.RekamMedis;
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
public class RekamMedisServiceTest {

    public RekamMedisServiceTest() {
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
     * Test of serviceInsertRekamMedis method, of class RekamMedisService.
     */
    @Test
    public void testServiceInsertRekamMedis() {
        System.out.println("serviceInsertRekamMedis");
        RekamMedis r = new RekamMedis();
        r.setNoDaftar("090920130001");
        r.setNoRm("000002");
        r.setNoStaf("STF.002");
        r.setIdUnitRs("POLI DALAM");
        r.setIdJaminan("ASKES");
        r.setNoDokter("DOK.002");
        r.setStatus("Tunggu");

        RekamMedisService instance = new RekamMedisService();
        instance.serviceInsertRekamMedis(r);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceUpdateRekamMedis method, of class RekamMedisService.
     */
    @Test
    public void testServiceUpdateRekamMedis() {
        System.out.println("serviceUpdateRekamMedis");
        RekamMedis r = new RekamMedis();

        r.setNoRm("000002");
        r.setNoStaf("STF.002");
        r.setIdUnitRs("POLI DALAM");
        r.setIdJaminan("ASKES");
        r.setNoDokter("DOK.002");

        r.setNoPerawat("PER.001");
        r.setNadi(20);
        r.setTemperatur(32);
        r.setPernapasan(45);
        r.setKesadaran("Ling-lung");
        r.setAnamnesa("Sakit Kepala");
        r.setTinggiBdn(178);
        r.setBeratBdn(65);
        r.setTensiDarah("60/34");
        r.setDiagnosis("Terlalu banyak pikiran");
        r.setTerapi("Terapi Energi");
        r.setStatus("Selesai");
        String noDaftar = "090920130001";
        RekamMedisService instance = new RekamMedisService();
        instance.serviceUpdateRekamMedis(r, noDaftar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of serviceDeleteRekamMedis method, of class RekamMedisService.
     */
//    @Test
//    public void testServiceDeleteRekamMedis() {
//        System.out.println("serviceDeleteRekamMedis");
//        String noDaftar = "090920130001";
//        RekamMedisService instance = new RekamMedisService();
//        instance.serviceDeleteRekamMedis(noDaftar);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of serviceGetAllRekamMedis method, of class RekamMedisService.
     */
//    @Test
//    public void testServiceGetAllRekamMedis() {
//        System.out.println("serviceGetAllRekamMedis");
//        RekamMedisService instance = new RekamMedisService();
//        List expResult = null;
//        List result = instance.serviceGetAllRekamMedis();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
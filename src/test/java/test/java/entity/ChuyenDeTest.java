
package test.java.entity;

import entity.ChuyenDe;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;

/**
 *
 * @author Thinkpad E440
 */
public class ChuyenDeTest {
    

    /**
     * Test of getMaChuyenDe method, of class ChuyenDe.
     */
    @Test
    public void testGetMaChuyenDe() {
        System.out.println("getMaChuyenDe");
        ChuyenDe instance = new ChuyenDe();
        instance.setMaChuyenDe("chuyenDe1");
        String expResult = "chuyenDe1";
        String result = instance.getMaChuyenDe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setMaChuyenDe method, of class ChuyenDe.
     */
   
    @Test(expected = NullPointerException.class)
    public void testSetMaChuyenDeNull() {
        System.out.println("setMaChuyenDe");
        String maChuyenDe = null;
        ChuyenDe instance = new ChuyenDe();
        instance.setMaChuyenDe(maChuyenDe);

    }

    /**
     * Test of getTenChuyenDe method, of class ChuyenDe.
     */
    @Test
    public void testGetTenChuyenDe() {
        System.out.println("getTenChuyenDe");
        ChuyenDe instance = new ChuyenDe();
        instance.setTenChuyenDe("CongNghe");
        String expResult = "CongNghe";
        String result = instance.getTenChuyenDe();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setTenChuyenDe method, of class ChuyenDe.
     */
    @Test(expected = NullPointerException.class)
    public void testSetTenChuyenDeNull() {
        System.out.println("setTenChuyenDe");
        String tenChuyenDe = null;
        ChuyenDe instance = new ChuyenDe();
        instance.setTenChuyenDe(tenChuyenDe);
     
    }
    @Test
    public void testSetTenChuyenDe() {
        System.out.println("setTenChuyenDe");
        String tenChuyenDe = "CongNghe";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenChuyenDe(tenChuyenDe);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of getHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(3000000f);
        float expResult = 3000000f;
        float result = instance.getHocPhi();
        assertEquals(result,expResult,0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        float hocPhi = 0.0F;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);
    }
    @Test
    public void testSetHocPhiNegative() {
        System.out.println("setHocPhi");
        float hocPhi = -100.0F;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);
        float expected = -1;
        assertEquals(expected, instance.getHocPhi(),0);
        
    }

    /**
     * Test of getThoiLuongHoc method, of class ChuyenDe.
     */
    @Test
    public void testGetThoiLuongHoc() {
        System.out.println("getThoiLuongHoc");
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuongHoc(100);
        int expResult = 100;
        int result = instance.getThoiLuongHoc();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setThoiLuongHoc method, of class ChuyenDe.
     */
    @Test
    public void testSetThoiLuongHocNegative() {
        System.out.println("setThoiLuongHoc");
        int thoiLuongHoc = -10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuongHoc(thoiLuongHoc);
        assertEquals(0, instance.getThoiLuongHoc());
    }

    /**
     * Test of getHinhAnh method, of class ChuyenDe.
     */
    @Test
    public void testGetHinhAnh() {
        System.out.println("getHinhAnh");
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getHinhAnh();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHinhAnh method, of class ChuyenDe.
     */
    @Test
    public void testSetHinhAnh() {
        System.out.println("setHinhAnh");
        String hinhAnh = "vmibbyyvdy2";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinhAnh(hinhAnh);
        assertEquals("vmibbyyvdy2", instance.getHinhAnh());
        
    }

    /**
     * Test of getMoTa method, of class ChuyenDe.
     */
    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa("xx");
        String expResult = "xx";
        String result = instance.getMoTa();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMoTa method, of class ChuyenDe.
     */
    @Test
    public void testSetMoTa() {
        System.out.println("setMoTa");
        String moTa = "eweewewewe";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(moTa);
        assertEquals("eweewewewe", instance.getMoTa());
    }


    
}

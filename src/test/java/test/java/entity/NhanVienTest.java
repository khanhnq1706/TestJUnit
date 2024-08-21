/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.java.entity;

import entity.NhanVien;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thinkpad E440
 */
public class NhanVienTest {
    
  

    /**
     * Test of getMaNhanVien method, of class NhanVien.
     */
    @Test
    public void testGetMaNhanVien() {
        System.out.println("getMaNhanVien");
        NhanVien instance = new NhanVien();
        instance.setMaNhanVien("nv01");
        String expResult = "nv01";
        String result = instance.getMaNhanVien();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setMaNhanVien method, of class NhanVien.
     */
    @Test
    public void testSetMaNhanVien() {
        System.out.println("setMaNhanVien");
        String maNhanVien = "NV01";
        NhanVien instance = new NhanVien();
        instance.setMaNhanVien(maNhanVien);

    }
    @Test(expected = NullPointerException.class)
    public void testSetMaNhanVienNull() {
        System.out.println("setMaNhanVien");
        String maNhanVien = null;
        NhanVien instance = new NhanVien();
        instance.setMaNhanVien(maNhanVien);

    }
    @Test(expected = Exception.class)
    public void testSetMaNhanVienEmpty() {
        System.out.println("setMaNhanVien");
        String maNhanVien = "";
        NhanVien instance = new NhanVien();
        instance.setMaNhanVien(maNhanVien);

    }

    /**
     * Test of getMatKhau method, of class NhanVien.
     */
    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        NhanVien instance = new NhanVien();
        instance.setMaNhanVien("123456789");
        String expResult = "123456789";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setMatKhau method, of class NhanVien.
     */
    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        String matKhau = "12345678";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
   
    }
    @Test(expected = NullPointerException.class)
    public void testSetMatKhauNull() {
        System.out.println("setMatKhau");
        String matKhau = null;
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
   
    }
    @Test(expected = Exception.class)
    public void testSetMatKhauEmpty() {
        System.out.println("setMatKhau");
        String matKhau = "";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
   
    }

    /**
     * Test of getHoVaTen method, of class NhanVien.
     */
    @Test
    public void testGetHoVaTen() {
        System.out.println("getHoVaTen");
        NhanVien instance = new NhanVien();
        String expResult = "Nguyen Van a";
        String result = instance.getHoVaTen();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setHoVaTen method, of class NhanVien.
     */
    @Test
    public void testSetHoVaTen() {
        System.out.println("setHoVaTen");
        String hoVaTen = "Nguyen Van A";
        NhanVien instance = new NhanVien();
        instance.setHoVaTen(hoVaTen);
      
    }
    @Test(expected = NullPointerException.class)
    public void testSetHoVaTenNull() {
        System.out.println("setHoVaTen");
        String hoVaTen = null;
        NhanVien instance = new NhanVien();
        instance.setHoVaTen(hoVaTen);
      
    }
    @Test(expected = Exception.class)
    public void testSetHoVaTenEmpty() {
        System.out.println("setHoVaTen");
        String hoVaTen = "";
        NhanVien instance = new NhanVien();
        instance.setHoVaTen(hoVaTen);
      
    }

    /**
     * Test of getVaiTro method, of class NhanVien.
     */
    @Test
    public void testGetVaiTro() {
        System.out.println("getVaiTro");
        NhanVien instance = new NhanVien();
        instance.setVaiTro(false);
        boolean expResult = false;
        boolean result = instance.getVaiTro();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setVaiTro method, of class NhanVien.
     */
    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        boolean vaiTro = false;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
    
    }
   
    
}
